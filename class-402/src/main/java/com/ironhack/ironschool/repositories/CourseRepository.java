package com.ironhack.ironschool.repositories;

import com.ironhack.ironschool.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
