package com.ironhack.netflix.services.impl;

import com.ironhack.netflix.models.*;
import com.ironhack.netflix.models.Role;
import com.ironhack.netflix.repositories.*;
import com.ironhack.netflix.services.impl.interfaces.*;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.http.*;
import org.springframework.security.core.authority.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;
import org.springframework.stereotype.*;
import org.springframework.web.server.*;

import java.util.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService implements AccountServiceInterface {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Account addAccount(Account account) {
        account.setPassword(passwordEncoder.encode(account.getPassword()));

        Role role = roleRepository.findByName("ROLE_USER").orElse(roleRepository.save(new Role(null, "ROLE_USER")));


        System.out.println(role.getName());
        System.out.println(role.getId());
        account.setRoles(List.of(role));
        return accountRepository.save(account);
    }

    public Account getAccountById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return account;
    }


}
