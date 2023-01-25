package com.ironhack.airport.repositories;

import com.ironhack.airport.models.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
public class CharactersTest {

    @Autowired
    CharacterRepository characterRepository;
    @Autowired
    WizardRepository wizardRepository;
    @Autowired
    WarriorRepository warriorRepository;

    @Test
    void shouldCreateAWizard_whenMethodSaveCalled() {
        wizardRepository.save(new Wizard("Jaume", true, 19, 56));
        warriorRepository.save(new Warrior("Ale", true, 24, 55));
    }

}
