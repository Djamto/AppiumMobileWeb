package com.appium.demo.steps;

import com.appium.demo.pages.ProductDetailsPage;
import com.appium.demo.pages.ProductsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by darjandjamtovski on 5/3/17.
 */
public class PageSteps extends BaseStep {

    private ProductsPage productsPage = new ProductsPage();
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Given("^The website is displayed to validate the product recipe$")
    public void givenTheWebsiteIsDisplayedToValidateTheProductRecipe(){
        loadWebPage();
    }

    @When("^The user has chosen all products$")
    public void whenTheUserHasChosenAllProducts(){
        productsPage.openAllProductsPage();
    }

    @And("^The user has chosen the product Fleur de Sel$")
    public void andTheUserHasChosenTheProductFleurdeSel(){
        productsPage.selectProduct(ProductsPage.Product.FLEUR_DE_SEL);
    }

    @And ("^The user has chosen the product Mediterraneo$")
    public void andTheUserHasChosenTheProductMediterraneo(){
        productsPage.selectProduct(ProductsPage.Product.MEDITERRANEO);
    }

    @And ("^The user has chosen the product Zenzero & Lemone$")
    public void andTheUserHasChosenTheProductZenzeroLemone(){
        productsPage.selectProduct(ProductsPage.Product.ZENZERO_LEMONE);
    }

    @Then("^Validate the product and the ingredients \"(.*)\"$")
    public void thenValidateTheProductFleurDeSelAndTheIngredients(String ingredients){
        String[] ingredientsArray = ingredients.split(";");

        Assert.assertTrue(productDetailsPage.isTitleDisplayed());

        for(int i = 0; i < ingredientsArray.length; i++) {
            Assert.assertTrue(productDetailsPage.isIngredientPresent(ingredientsArray[i]));
        }
    }
}
