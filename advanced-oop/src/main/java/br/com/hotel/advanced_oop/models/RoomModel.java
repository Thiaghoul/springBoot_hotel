package br.com.hotel.advanced_oop.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "TB_ROOM")
public class RoomModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public enum RoomType{
		SINGLE, COUPLE, FAMILY
	};
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false)
	private int quantity;
	
	@JsonProperty("type")
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private RoomType type;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
	private Set<ReserveModel> reservs = new HashSet<ReserveModel>();
	
//	@JsonProperty("hotel")
// 	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "hotel_id", nullable = false)
//	private HotelModel hotel;
//	
	
	
	
	
}
