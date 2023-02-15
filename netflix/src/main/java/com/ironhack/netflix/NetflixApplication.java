package com.ironhack.netflix;

import com.ironhack.netflix.models.*;
import com.ironhack.netflix.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;

import java.util.*;

@SpringBootApplication
public class NetflixApplication {


    public static void main(String[] args) {
        SpringApplication.run(NetflixApplication.class, args);
    }

}
