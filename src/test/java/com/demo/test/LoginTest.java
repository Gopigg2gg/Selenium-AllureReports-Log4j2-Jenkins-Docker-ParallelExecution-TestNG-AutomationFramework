/*
 * 
 * Author: Gopinath Angusamy
 * 
 */
package com.demo.test;


import com.demo.BaseWeb;
import com.demo.data.LoginDataFactory;
import com.demo.data.PropertyData;
import com.demo.model.Login;
import com.demo.page.objects.CustomerPage;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest extends BaseWeb{
	
	
	@Test(description = "LogintoOKC", groups = "Sanity")
    public static void login_to_okc() throws InterruptedException {
		
		Login loginInformation = new LoginDataFactory().logintoweb();
	    CustomerPage customer = new CustomerPage();   
	}
}
