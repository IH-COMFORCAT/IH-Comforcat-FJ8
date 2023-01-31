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

    public void updateNurse(Long id, Nurse nurse) {
        Nurse nurseFromDB = nurseRepository.findById(id).get();
        nurseFromDB.setName(nurse.getName());
        nurseFromDB.setSurname(nurse.getSurname());
        nurseRepository.save(nurseFromDB);
    }

    public void updateNurseName(Long id, String name) {
        Nurse nurseFromDB = nurseRepository.findById(id).get();
        nurseFromDB.setName(name);
        nurseRepository.save(nurseFromDB);

    }

    public void delete(Long id) {
        nurseRepository.deleteById(id);
    }
}
