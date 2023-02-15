package com.ironhack.netflix.controllers;

import com.ironhack.netflix.models.*;
import com.ironhack.netflix.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlanController {

    @Autowired
    PlanRepository planRepository;

    @PostMapping("plans/new")
    public Plan createNewPlan(@RequestBody Plan plan) {
        return planRepository.save(plan);
    }
}
