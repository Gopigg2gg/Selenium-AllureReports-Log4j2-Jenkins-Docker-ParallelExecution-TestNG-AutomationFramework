/*
 * 
 * Author: Gopinath Angusamy
 * 
 */
package com.demo.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.BaseWeb;
import com.demo.data.PropertyData;
import com.demo.page.objects.CustomerPage;


public class AddCustomerTest extends BaseWeb {
	

	LoginTest login;
	
	public AddCustomerTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		LoginTest.login_to_okc();
		Thread.sleep(5000);
	}
    
    @Test(groups = "Customer")
    public void addCustomer_withoutmobile() throws InterruptedException {
    	
    	CustomerPage customer = new CustomerPage();
    	customer.verify_addcustomer();
    	Thread.sleep(2000);
    	customer.click_addcustomer();
    	Thread.sleep(2000);
    }
	
}
