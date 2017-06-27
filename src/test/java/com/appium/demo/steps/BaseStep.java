package com.appium.demo.steps;

import com.appium.demo.base.AppConfig;
import com.appium.demo.base.DriverHelper;

/**
 * Created by darjandjamtovski on 4/26/17.
 */
public class BaseStep {

    private static AppConfig appConfig = new AppConfig();

    protected void loadWebPage(){
        DriverHelper.driver.navigate().to(appConfig.getProperty(AppConfig.PROPERTY_URL));
    }
}
