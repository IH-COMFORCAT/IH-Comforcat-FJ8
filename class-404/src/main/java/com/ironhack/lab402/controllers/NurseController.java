package com.ironhack.lab402.controllers;

import com.ironhack.lab402.models.*;
import com.ironhack.lab402.repositories.*;
import com.ironhack.lab402.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class NurseController {

    @Autowired
    NurseService nurseService;

    @GetMapping("/nurses")
    public List<Nurse> findAllNurses() {
        return nurseService.findAllNurses();
    }

    @PostMapping("/nurses")
    @ResponseStatus(HttpStatus.CREATED)
    public Nurse createNurse(@RequestBody Nurse nurse) {
        return nurseService.createNurse(nurse);

    }

}
