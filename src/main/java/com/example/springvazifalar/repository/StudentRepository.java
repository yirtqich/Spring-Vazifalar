package com.example.springvazifalar.repository;

import com.example.springvazifalar.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Passport, Integer> {

}
