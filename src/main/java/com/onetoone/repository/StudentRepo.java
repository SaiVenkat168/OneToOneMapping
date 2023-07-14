package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
