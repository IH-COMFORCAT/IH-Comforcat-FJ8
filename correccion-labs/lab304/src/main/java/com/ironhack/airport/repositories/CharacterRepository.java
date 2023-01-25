package com.ironhack.airport.repositories;

import com.ironhack.airport.models.Character;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {
}
