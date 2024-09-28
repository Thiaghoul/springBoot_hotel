package br.com.hotel.advanced_oop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hotel.advanced_oop.models.RoomModel;
import br.com.hotel.advanced_oop.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	private final RoomService roomService;
	
	@Autowired
	public RoomController(RoomService roomService) {
		super();
		this.roomService = roomService;
	}
	
	@GetMapping
	public List<RoomModel> getAllRooms(){
		return roomService.getAll();
	}
	
	@PostMapping
	public RoomModel saveRoom(@RequestBody RoomModel room) {
		return roomService.save(room);
	}
}
