/*
 * 
 * Author: Gopinath Angusamy
 * 
 */
package com.demo.page.objects;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demo.driver.DriverManager;
import com.demo.page.login.common.NavigationPage;

import io.qameta.allure.Step;

public class CustomerPage extends NavigationPage{

	
	@FindBy(xpath = "")
	private WebElement addCustomer;
	
	@FindBy(xpath = "")
	private List<WebElement> CustomerName;
	
	
	@Step  
	  public void verify_addcustomer() {
		
		wait.until(ExpectedConditions.elementToBeClickable(addCustomer));
		Assert.assertTrue(addCustomer.isDisplayed());
	    }
	
	@Step  
	  public void click_addcustomer() {
		wait.until(ExpectedConditions.elementToBeClickable(addCustomer));
		addCustomer.click();
	    }
	@Step  
	  public void click_customerName() {
		wait.until(ExpectedConditions.elementToBeClickable(CustomerName.get(1)));
		CustomerName.get(1).click();
	    }
	
}
