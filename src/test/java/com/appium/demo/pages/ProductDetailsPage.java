package com.appium.demo.pages;

import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 5/3/17.
 */
public class ProductDetailsPage extends BasePage{

    public boolean isTitleDisplayed(){
        try{
         waitForElementVisible(By.xpath(".//*[@id='scene_parallax']//h1/img"));
         return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean isIngredientPresent(String ingredient){
        try{
            waitForElementVisible(By.xpath(".//*[@id='scene_parallax']//div[text() = '"+ingredient+"']"));
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
