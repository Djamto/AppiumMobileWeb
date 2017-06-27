package com.appium.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by darjandjamtovski on 5/3/17.
 */
public class ProductsPage extends BasePage{

    public enum Product{
        FLEUR_DE_SEL ("fleur-de-sel"),
        MEDITERRANEO ("mediterranean"),
        ZENZERO_LEMONE ("ginger-lemon");

        private final String product;

        Product(String product){
            this.product = product;
        }

        public String toString(){
            return this.product;
        }
    }

    public void selectProduct(Product product){
        WebElement productElement = waitForElementVisible(By.xpath(".//*[@id='page_container']//a[contains(@href, '"+ product.toString() +"')]"));
        productElement.click();
    }
}
