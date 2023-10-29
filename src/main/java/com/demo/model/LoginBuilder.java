/*
 * 
 * Author: Gopinath Angusamy
 * 
 */
package com.demo.model;

public class LoginBuilder {

	 private String mobilenumber;

	    public LoginBuilder mobile(String mobilenumber) {
	        this.mobilenumber = mobilenumber;
	        return this;
	    }
	    
	    public Login build() {
	        return new Login(mobilenumber);
	    }
}
