package br.com.hotel.advanced_oop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_EMPLOYEE")
public class EmployeeModel extends PersonModel{
	
	private enum position{
		attendant, manager
	}
	
	@Column(nullable = false, unique = false)
	private position typePosition;
	private double salaryPerHour;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hotel_id", nullable = false)
	private HotelModel hotel;


	public position getTypePosition() {
		return typePosition;
	}


	public void setTypePosition(position typePosition) {
		this.typePosition = typePosition;
	}


	public double getSalaryPerHour() {
		return salaryPerHour;
	}


	public void setSalaryPerHour(double salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}


	public HotelModel getHotel() {
		return hotel;
	}


	public void setHotel(HotelModel hotel) {
		this.hotel = hotel;
	}
	
	
	
	
	
	
	
	
	
	

}
