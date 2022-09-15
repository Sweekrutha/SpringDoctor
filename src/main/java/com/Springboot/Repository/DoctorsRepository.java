package com.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Entity.Doctors;

public interface DoctorsRepository extends JpaRepository<Doctors,Integer> 
{
   Doctors findByName(String name);
}
