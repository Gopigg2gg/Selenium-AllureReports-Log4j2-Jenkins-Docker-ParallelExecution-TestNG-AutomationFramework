/*
 * 
 * Author: Gopinath Angusamy
 * 
 */

package com.demo.data;

import static com.demo.config.ConfigurationManager.configuration;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demo.model.Login;
import com.demo.model.LoginBuilder;
import com.github.javafaker.Faker;

public class SearchDataFactory {
	
	 private final Faker faker;
	    private static final Logger logger = LogManager.getLogger(LoginDataFactory.class);

	    public SearchDataFactory() {
	        faker = new Faker(new Locale(configuration().faker()));
	    }

	    
	    public Login randomSearch() {
	    	Login login = new LoginBuilder().
	    		mobile(faker.name().fullName()).build();

	        logger.info(login);
	        return login;
	    }
}
