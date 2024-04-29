package com.example.golf.repository;

import com.example.golf.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,String> {
}

