package com.ironhack.lab402.services;

import com.ironhack.lab402.models.*;
import com.ironhack.lab402.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class NurseService {

    @Autowired
    NurseRepository nurseRepository;

    public List<Nurse> findAllNurses() {
        return nurseRepository.findAll();
    }

    public Nurse createNurse(Nurse nurse) {
        return nurseRepository.save(nurse);
    }
}
