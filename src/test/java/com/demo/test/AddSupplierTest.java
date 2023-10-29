/*
 * 
 * Author: Gopinath Angusamy
 * 
 */
package com.demo.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.BaseWeb;
import com.demo.data.PropertyData;
import com.demo.page.objects.SupplierPage;

public class AddSupplierTest extends BaseWeb {
	
	
LoginTest login;
	
	public AddSupplierTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		login.login_to_okc();
		Thread.sleep(5000);
	}
	@Test
    public void addsupplier() throws InterruptedException {
    	
    	SupplierPage supplier = new SupplierPage();
    	Thread.sleep(2000);
        supplier.navigate_supplirTab();
        Thread.sleep(2000);
        supplier.verify_addsupplier();
        Thread.sleep(2000);
        supplier.click_addsupplier();

        supplier.navigate_supplirTab();
        Thread.sleep(2000);
    	supplier.verify_addsupplier();
    	Thread.sleep(2000);
    	supplier.click_addsupplier();
    	Thread.sleep(2000);
   
    	
    }

}
