package com.akanksha.model;

import lombok.Data;

@Data
public class PartnerResponse {
	
	private String status;
	private Partner partner;
	private int errorCode;
	private String errorDesc;

}
