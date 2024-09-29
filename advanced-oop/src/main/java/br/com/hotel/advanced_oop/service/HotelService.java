package br.com.hotel.advanced_oop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hotel.advanced_oop.models.HotelModel;
import br.com.hotel.advanced_oop.repository.HotelRepository;

@Service
public class HotelService {

	private final HotelRepository hotelRepository;

	@Autowired
	public HotelService(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}
	
	public HotelModel save(HotelModel hotel) {
		return hotelRepository.save(hotel);
	}
	
	public List<HotelModel> getAll(){
		return hotelRepository.findAll();
	}
	
	
}
