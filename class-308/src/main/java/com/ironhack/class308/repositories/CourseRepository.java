package com.ironhack.class308.repositories;

import com.ironhack.class308.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

}
