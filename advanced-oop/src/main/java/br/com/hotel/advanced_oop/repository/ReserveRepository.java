package br.com.hotel.advanced_oop.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.advanced_oop.models.ReserveModel;

public interface ReserveRepository extends JpaRepository<ReserveModel, UUID>{

}
