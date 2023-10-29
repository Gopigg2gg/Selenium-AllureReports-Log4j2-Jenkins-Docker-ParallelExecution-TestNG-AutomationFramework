/*
 * 
 * Author: Gopinath Angusamy
 * 
 */

package com.demo.page.login.common;

import com.demo.driver.DriverManager;
import com.demo.page.AbstractPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationPage extends AbstractPageObject {

	protected static WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
    
    @FindBy(xpath ="")
    private WebElement welcome_to_;
    
    @FindBy(xpath ="")
    private WebElement digital_bahi_khata;
    
    
}
