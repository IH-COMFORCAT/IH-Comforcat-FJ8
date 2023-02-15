package com.ironhack.netflix.controllers;

import com.fasterxml.jackson.databind.*;
import com.ironhack.netflix.models.*;
import com.ironhack.netflix.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.http.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.setup.*;
import org.springframework.web.context.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class AccountControllerTest {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    PlanRepository planRepository;

    Plan plan;
    Account account;

    private MockMvc mockMvc;


    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        plan = planRepository.save(new Plan("Basic", 14.99));
        account = accountRepository.save(new Account("jaume@ironhack.com", "1234", plan));

    }

    @AfterEach
    void tearDown() {
        accountRepository.deleteAll();
        planRepository.deleteAll();
    }


    @Test
    void shouldReturnAccount_WhenPathCalled() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/account/" + account.getId())).andExpect(status().isOk()).andReturn();
        MvcResult mvcResult2 = mockMvc.perform(get("/account/" + 75)).andExpect(status().isNotFound()).andReturn();

        assertTrue(mvcResult.getResponse().getContentAsString().contains("jaume@ironhack.com"));

    }

    @Test
    void shouldCreateNewAccount_WhenPostPerformed() throws Exception {
        Account account1 = new Account("jose@ironhack.com", "4545645", plan);
        String accountToJson = objectMapper.writeValueAsString(account1);

        MvcResult resultPost = mockMvc.perform(post("/account/new-account")
                .content(accountToJson)
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated()).andReturn();

        System.out.println(resultPost.getResponse().getContentAsString());

        assertTrue(resultPost.getResponse().getContentAsString().contains("\"email\":\"jose@ironhack.com\""));


    }


}
