package com.in28minutes.springboot.springjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.springjpa.course.springdatajpa.CourseSpringDataJpaRespository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRespository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"Learn Azure","in 1 month"));
		repository.save(new Course(2,"Learn AWS","in 1.2 month"));
		repository.save(new Course(3,"Learn Devops","in 1.3 month"));
		repository.save(new Course(4,"Learn Docker","in 1.4 month"));
		repository.save(new Course(5,"Learn Jenkins","Sean Jones"));
		repository.deleteById(2l);
		System.out.print(repository.findById(1l));
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("Sean Jones"));
		
	}

}
