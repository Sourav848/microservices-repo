package com.akanksha.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.akanksha.model.Partner;
import com.akanksha.model.ValidationResponse;


@FeignClient(url="http://localhost:8081/fiserv/v1/partnerValidation", name="validation")
public interface ValidationClient {
	
	@PostMapping("/validatePartner")
    public ResponseEntity<ValidationResponse> validate(@RequestBody Partner partner);

}
