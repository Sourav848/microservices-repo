package com.micro.exceptionHandling;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.micro.CustomExceptions.PartnerNotFoundException;
import com.micro.model.PartnerResponse;


@ControllerAdvice
public class HandleExceptions {
	
	@ExceptionHandler(PartnerNotFoundException.class)
	public ResponseEntity<PartnerResponse> partnerNotFound(PartnerNotFoundException ex){
		
		PartnerResponse response=new PartnerResponse();
		response.setStatus("FAIL");
		response.setErrorCode(100);
		response.setErrorDesc("Partner Not Present, Please try for another partner Id");
		
		return ResponseEntity.badRequest().body(response);
	
	}

}
