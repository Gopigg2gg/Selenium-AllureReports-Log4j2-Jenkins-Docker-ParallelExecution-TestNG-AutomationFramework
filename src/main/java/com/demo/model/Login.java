/*
 * 
 * Author: Gopinath Angusamy
 * 
 */
package com.demo.model;

public class Login {
	
	private String mobile;

    public Login(String mobile) {
        this.mobile = mobile;
        
    }

    public Login() {
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setmobile(String mobile) {
        this.mobile = mobile;
    }

    public String toString() {
        return "Login(mobile=" + this.getMobile() + ")";
    }

}
