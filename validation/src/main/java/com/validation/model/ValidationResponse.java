package com.validation.model;

import lombok.Data;

@Data
public class ValidationResponse {
	
	private String status;
	private int errorCode;
	private String errorDesc;

	
	
}
