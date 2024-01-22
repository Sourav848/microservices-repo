package com.validation.service;

import org.springframework.stereotype.Service;

import com.validation.model.Partner;
import com.validation.model.ValidationResponse;

@Service
public class ValidationService {

	
	
	 public ValidationResponse validatePartner(Partner partner)  {
	    	
	    	
	    		
		 ValidationResponse response=new ValidationResponse();
	    		 	
	    		response.setErrorCode(0);
	    		response.setErrorDesc("NO ERROR");
	    		response.setStatus("SUCCESS");
	    		return response;
	    		
	    		 
	    
	    	
	        	//throw new PartnerNotFoundException();
	    			
	    }
}
