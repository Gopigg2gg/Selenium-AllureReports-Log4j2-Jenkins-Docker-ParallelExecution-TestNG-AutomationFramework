/*
 * 
 * Author: Gopinath Angusamy
 * 
 */

package com.demo.data;

import com.demo.model.Login;
import com.demo.model.LoginBuilder;
import com.github.javafaker.Faker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.demo.config.ConfigurationManager.configuration;

import java.util.Locale;

public class LoginDataFactory {
	
	 private final Faker faker;
	    private static final Logger logger = LogManager.getLogger(LoginDataFactory.class);

	    public LoginDataFactory() {
	        faker = new Faker(new Locale(configuration().faker()));
	    }

	    
	    public Login logintoweb() {
	    	Login login = new LoginBuilder().
	    		mobile(faker.phoneNumber().cellPhone()).build();

	        logger.info(login);
	        return login;
	    }

}
