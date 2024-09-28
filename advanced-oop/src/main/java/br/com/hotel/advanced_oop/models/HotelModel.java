package br.com.hotel.advanced_oop.models;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_HOTEL")
public class HotelModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false, unique = true)
	private String hotelName;
	private String address;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
	private Set<EmployeeModel> employees = new HashSet<EmployeeModel>();
	
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
	private Set<RoomModel> rooms = new HashSet<RoomModel>();

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}

	public Set<EmployeeModel> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<EmployeeModel> employees) {
		this.employees = employees;
	}

	public Set<RoomModel> getRooms() {
		return rooms;
	}

	public void setRooms(Set<RoomModel> rooms) {
		this.rooms = rooms;
	}
	
	
	

	
}
