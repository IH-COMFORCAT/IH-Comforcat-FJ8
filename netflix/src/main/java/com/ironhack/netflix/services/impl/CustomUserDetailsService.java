package com.ironhack.netflix.services.impl;

import com.ironhack.netflix.models.*;
import com.ironhack.netflix.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.authority.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.*;

import java.util.*;
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    AccountRepository accountRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Account account = accountRepository.findByEmail(username);
        if (account == null) {
            throw new UsernameNotFoundException("User doesn't exist in the database");
        } else {
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            for (Role role : account.getRoles()) {
                authorities.add(new SimpleGrantedAuthority(role.getName()));
                System.out.println(role.getName());

            }
            return new User(account.getEmail(), account.getPassword(), authorities);

        }

    }
}
