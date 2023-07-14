package com.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onetoone.entity.*;
import com.onetoone.repository.StudentRepo;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner
{
	
	@Autowired
	StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student=new Student("John");
		Item it=new Item(4);
		student.setItem(it);
		studentRepo.save(student);
		
		Student student1=new Student("Chotu");
		Item it1=new Item(4);
		student1.setItem(it1);
		
		studentRepo.save(student1);
		
	}

}
