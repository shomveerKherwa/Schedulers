package com.somhome.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	private Logger log = LoggerFactory.getLogger(DemoService.class);
	
	public void perfromServiceLogic() {
		log.info("Perform Business Logic");
	}
}
