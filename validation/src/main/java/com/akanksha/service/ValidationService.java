package com.akanksha.service;

import org.springframework.stereotype.Service;

import com.akanksha.model.Partner;
import com.akanksha.model.ValidationResponse;

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
