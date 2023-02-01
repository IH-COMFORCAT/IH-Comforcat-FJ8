package com.ironhack.class406.controllers;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.ironhack.class406.enums.*;
import com.ironhack.class406.models.*;
import com.ironhack.class406.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.http.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.setup.*;
import org.springframework.web.context.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Si no funciona el método de la petición, copiar este import
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.math.*;
import java.util.*;

@SpringBootTest
public class ProductControllerTest {

    @Autowired
    WebApplicationContext context;

    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        Product product1 = new Product("Gafas", new BigDecimal("25.50"), Category.COMMERCIAL_NEW, Department.CLOTHING);
        Product product2 = new Product("Chaqueta", new BigDecimal("49.99"), Category.COMMERCIAL_NEW, Department.CLOTHING);
        productRepository.saveAll(List.of(product1, product2));

    }

    @AfterEach
    void tearDown() {
        productRepository.deleteAll();
    }

    @Test
    void shouldReturnProducts_WhenProductsALlIsCalled() throws Exception {
        MvcResult mvcResult =
                mockMvc.perform(get("/products/all")).andExpect(status().isOk()).andReturn();

        assertTrue(mvcResult.getResponse().getContentAsString().contains("Gafas"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("Chaqueta"));

    }

    @Test
    void shouldAddNewProduct_WhenPostIsPerformed() throws Exception {
        Product product = new Product("Pantalones", new BigDecimal("39.90"), Category.COMMERCIAL_NEW, Department.CLOTHING);
        String body = objectMapper.writeValueAsString(product);
        MvcResult mvcResult = mockMvc.perform(post("/products").content(body).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isCreated()).andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("Pantalones"));
    }

    @Test
    void shouldReturnProduct_WhenFindById() throws Exception {
        Product product = productRepository.findAll().get(0);
        MvcResult mvcResult = mockMvc.perform(get("/products/" + product.getId())).andExpect(status().isOk()).andReturn();

        assertTrue(mvcResult.getResponse().getContentAsString().contains("Gafas"));
        assertFalse(mvcResult.getResponse().getContentAsString().contains("Chaqueta"));

    }

}
