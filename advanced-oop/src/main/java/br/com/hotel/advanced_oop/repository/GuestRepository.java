package br.com.hotel.advanced_oop.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.advanced_oop.models.GuestModel;

public interface GuestRepository extends JpaRepository<GuestModel, UUID>{

	GuestModel findGuestModelByName(String name);
	
}
