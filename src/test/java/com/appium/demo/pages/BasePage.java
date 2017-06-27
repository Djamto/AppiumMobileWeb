package com.appium.demo.pages;

import com.appium.demo.base.AppConfig;
import com.appium.demo.base.DriverHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by darjandjamtovski on 4/26/17.
 */
public class BasePage {

    private AppConfig appConfig = new AppConfig();

    protected WebElement waitForElementVisible(By by){
        WebDriverWait webDriverWait = new WebDriverWait(DriverHelper.driver, Long.parseLong(appConfig.getProperty(AppConfig.PROPERTY_EXPLICIT_WAIT)));
        WebElement element = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));

        return element;
    }

    public void openAllProductsPage(){
        WebElement menuButton = waitForElementVisible(By.className("btn_open"));
        menuButton.click();

        WebElement allProductsButton = waitForElementVisible(By.className("all_products_mobile_txt"));
        allProductsButton.click();
    }

}
