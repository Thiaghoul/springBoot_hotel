package br.com.hotel.advanced_oop.models;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_GUEST")
public class GuestModel extends PersonModel {

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "guest")
	Set<ReserveModel> reservHistoric = new HashSet<ReserveModel>();

	public Set<ReserveModel> getReservHistoric() {
		return reservHistoric;
	}

	public void setReservHistoric(Set<ReserveModel> reservHistoric) {
		this.reservHistoric = reservHistoric;
	}
	
	
}
