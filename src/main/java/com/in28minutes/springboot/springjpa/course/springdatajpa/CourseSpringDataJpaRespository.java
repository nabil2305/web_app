 package com.in28minutes.springboot.springjpa.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.springjpa.course.Course;

public interface CourseSpringDataJpaRespository extends JpaRepository<Course,Long> 
{
	
	List<Course> findByAuthor(String author);
	
}
