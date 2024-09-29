package br.com.hotel.advanced_oop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hotel.advanced_oop.models.HotelModel;
import br.com.hotel.advanced_oop.service.HotelService;


@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private final HotelService hotelService;
	
	public HotelController(HotelService hotelService) {
		super();
		this.hotelService = hotelService;
	}
	
	@GetMapping
	public List<HotelModel> getAllRooms(){
		return hotelService.getAll();
	}
	
	@PostMapping
	public HotelModel saveHotel(@RequestBody HotelModel hotel) {
		
		return hotelService.save(hotel);
	}
}
