package com.ironhack.netflix.controllers;

import com.ironhack.netflix.models.*;
import com.ironhack.netflix.services.impl.*;
import com.ironhack.netflix.services.impl.interfaces.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    AccountServiceInterface accountService;

    @GetMapping("/account/{id}")
    public Account findAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }

    @PostMapping("/account/new-account")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }


}
