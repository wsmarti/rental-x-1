package com.rentalx.account;

import java.util.List;

import lombok.Data;

@Data
public class Customer {
	private List<PersonalDocument> personalDocumentList;
}
