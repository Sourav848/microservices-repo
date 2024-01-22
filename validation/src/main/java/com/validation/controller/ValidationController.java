package com.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.model.Partner;
import com.validation.model.ValidationResponse;
import com.validation.service.ValidationService;


@RestController
@RequestMapping("fiserv/v1/partnerValidation")
public class ValidationController {
	
	@Autowired
	private ValidationService service;
	
	@PostMapping("/validatePartner")
    public ResponseEntity<ValidationResponse> validate(@RequestBody Partner partner)  {
		ValidationResponse response = service.validatePartner( partner);
      
       return  ResponseEntity.ok().body(response);
        
    }
 

}
