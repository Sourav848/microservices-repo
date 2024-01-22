package com.akanksha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.akanksha.CustomExceptions.PartnerNotFoundException;
import com.akanksha.model.Partner;
import com.akanksha.model.PartnerResponse;
import com.akanksha.service.PartnerService;

@RestController
@RequestMapping("fiserv/v1/partnerOperations")
public class PartnerController {

	@Autowired
	private PartnerService service;

	@PostMapping("/addPartner")
	public ResponseEntity<PartnerResponse> addProduct(@RequestBody Partner partner) {
		PartnerResponse response= service.savePartner(partner);
		return ResponseEntity.ok().body(response);
	}

	@GetMapping("/partnerById/{id}")
	public ResponseEntity<PartnerResponse> findProductById(@PathVariable Integer id) throws PartnerNotFoundException {
		PartnerResponse response = service.getPartnerById(id);
		return  ResponseEntity.ok().body(response);

	}
}

