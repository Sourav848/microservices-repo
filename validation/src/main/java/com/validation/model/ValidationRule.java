package com.validation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationRule {
	
	private String fieldName;
	private String fieldRequired;
	//private List<String> fieldDataType;
	//private List<String> AllowedValues;
	//private String minLength;
	//private String maxLength;
	//private List<String> fieldModule;

}
