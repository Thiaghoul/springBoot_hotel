package br.com.hotel.advanced_oop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hotel.advanced_oop.models.RoomModel;
import br.com.hotel.advanced_oop.repository.RoomRepository;


@Service
public class RoomService {
	
	private final RoomRepository roomRepository;

	@Autowired
	public RoomService(RoomRepository roomRepository) {
		super();
		this.roomRepository = roomRepository;
	}
	
	public RoomModel save(RoomModel room) {
		return roomRepository.save(room);
	}
	
	public List<RoomModel> getAll(){
		return roomRepository.findAll();
	}
	
	
	
}
