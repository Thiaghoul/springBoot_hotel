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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_HOTEL")
public class HotelModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false, unique = true)
	private String hotelName;
	
	@Column(nullable = false, unique = true)
	private String address;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
	private Set<EmployeeModel> employees = new HashSet<EmployeeModel>();
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
	private Set<RoomModel> rooms = new HashSet<RoomModel>();

	
	

	
}
