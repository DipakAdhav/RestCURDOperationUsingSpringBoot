package com.RestCURDOperation.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.RestCURDOperation.Entities.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
