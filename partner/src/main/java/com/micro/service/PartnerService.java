package com.micro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.micro.CustomExceptions.PartnerNotFoundException;
import com.micro.client.ValidationClient;
import com.micro.model.Partner;
import com.micro.model.PartnerResponse;
import com.micro.model.ValidationResponse;
import com.micro.repository.PartnerRepository;

@Service
public class PartnerService {

	@Autowired
	private PartnerRepository repository;

	@Autowired
	private ValidationClient validationClient;

	public ResponseEntity<ValidationResponse> validatePartner(Partner partner) {

		return validationClient.validate(partner);

	}

	public PartnerResponse savePartner(Partner onBoardingPartner) {

		PartnerResponse response = new PartnerResponse();

		ResponseEntity<ValidationResponse> validationResponse =

				validationClient.validate(onBoardingPartner);

		String status = validationResponse.getBody().getStatus();

		if ("SUCCESS".equals(status)) {
			Partner onBoardedPartner = repository.save(onBoardingPartner);

			response.setPartner(onBoardedPartner);
			response.setStatus("SUCCESS!");
			response.setErrorCode(0);
			response.setErrorDesc("NO ERROR");
			return response;
		}

		int errorCode = validationResponse.getBody().getErrorCode();
		String errorDesc = validationResponse.getBody().getErrorDesc();

		response.setErrorCode(errorCode);
		response.setErrorDesc(errorDesc);

		return response;

	}

	public PartnerResponse getPartnerById(Integer id) throws PartnerNotFoundException {

		if (repository.findById(id).isPresent()) {

			PartnerResponse response = new PartnerResponse();
			response.setPartner(repository.findById(id).get());
			response.setStatus("SUCESS!");
			response.setErrorCode(0);
			response.setErrorDesc("NO ERROR");

			return response;

		}

		throw new PartnerNotFoundException();

	}

}
