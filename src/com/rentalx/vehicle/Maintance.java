package com.rentalx.vehicle;


import com.rentalx.account.Supplier;

import lombok.Data;

@Data
public class Maintance {
	private Supplier supplier;
	private Double price;
}
