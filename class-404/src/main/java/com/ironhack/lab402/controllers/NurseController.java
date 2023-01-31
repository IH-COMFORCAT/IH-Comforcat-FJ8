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

    @PutMapping("/nurses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateNurse(@PathVariable Long id, @RequestBody Nurse nurse) {
        nurseService.updateNurse(id, nurse);
    }

    @PatchMapping("nurses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateName(@PathVariable Long id, @RequestParam String name) {
        nurseService.updateNurseName(id, name);
    }

    @DeleteMapping("/nurses/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteNurse(@PathVariable Long id) {
        nurseService.delete(id);
    }

}
