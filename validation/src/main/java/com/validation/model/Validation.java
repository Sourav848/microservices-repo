package com.validation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Validation {
	
	private String fieldName;
	private String fieldValue;
	private ValidationRule rule;
	private boolean status;
	private String errorType;

}
