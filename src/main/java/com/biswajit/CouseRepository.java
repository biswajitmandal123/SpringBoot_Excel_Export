package com.biswajit;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CouseRepository extends JpaRepository<Course, Serializable> {

 

}
