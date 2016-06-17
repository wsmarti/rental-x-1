package com.rentalx.account;

import java.util.List;

import com.rentalx.rental.Booking;
import com.rentalx.vehicle.Car;

import lombok.Data;

@Data
public class Organization extends Company {
	private List<Booking> bookingList;
	private List<Car> carList;
	private List<Supplier> supplierList; 
	
}
