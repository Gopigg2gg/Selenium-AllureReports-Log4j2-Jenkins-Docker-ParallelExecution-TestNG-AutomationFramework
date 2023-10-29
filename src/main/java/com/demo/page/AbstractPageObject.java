/*
 * 
 * Author: Gopinath Angusamy
 * 
 */

package com.demo.page;

import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.demo.driver.DriverManager;

import static com.demo.config.ConfigurationManager.configuration;
import static org.openqa.selenium.support.PageFactory.initElements;

public class AbstractPageObject {

    protected AbstractPageObject() {
        initElements(new AjaxElementLocatorFactory(DriverManager.getDriver(), configuration().timeout()), this);
    }
}
