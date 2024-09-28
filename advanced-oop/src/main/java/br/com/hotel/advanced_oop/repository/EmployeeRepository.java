package br.com.hotel.advanced_oop.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.advanced_oop.models.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, UUID>{

}
