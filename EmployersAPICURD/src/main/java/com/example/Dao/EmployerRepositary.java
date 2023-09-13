package com.example.Dao;

import org.springframework.data.repository.CrudRepository;
import com.example.EmployersEntity.EmployersEntity;


public interface EmployerRepositary extends CrudRepository<EmployersEntity, Integer> {

}
