package com.validation.model;

@FunctionalInterface
public interface Validator {
	
	 Validation validate(Validation validation);

}
