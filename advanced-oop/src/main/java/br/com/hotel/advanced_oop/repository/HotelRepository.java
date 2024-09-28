package br.com.hotel.advanced_oop.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hotel.advanced_oop.models.HotelModel;


@Repository
public interface HotelRepository extends JpaRepository<HotelModel, UUID> {

}
