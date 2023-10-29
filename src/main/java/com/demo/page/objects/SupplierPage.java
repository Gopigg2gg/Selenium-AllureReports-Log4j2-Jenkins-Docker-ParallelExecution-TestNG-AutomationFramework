/*
 * 
 * Author: Gopinath Angusamy
 * 
 */
package com.demo.page.objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.demo.page.login.common.NavigationPage;

import io.qameta.allure.Step;

public class SupplierPage extends NavigationPage {

	@FindBy(xpath = "")
	private static WebElement SupplierTab;

	@FindBy(xpath = "")
	private static WebElement AddSupplier;

	
	String SupplierNameinDetailsPage;
	String UpdatedSupplierName;

	@Step
	public void navigate_supplirTab() {
		wait.until(ExpectedConditions.elementToBeClickable(SupplierTab));
		Assert.assertTrue(SupplierTab.isDisplayed());
		SupplierTab.click();
	}

	@Step
	public void verify_addsupplier() {

		wait.until(ExpectedConditions.elementToBeClickable(AddSupplier));
		Assert.assertTrue(AddSupplier.isDisplayed());
	}

	@Step
	public void click_addsupplier() {
		wait.until(ExpectedConditions.elementToBeClickable(AddSupplier));
		AddSupplier.click();
	}
}
