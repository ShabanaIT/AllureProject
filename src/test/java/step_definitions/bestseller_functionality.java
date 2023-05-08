package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import base_amazon_project.Base_Amazon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bestseller_functionality extends Base_Amazon {
	
//I am in landing page
	@Given("I am in landing page")
	public void i_am_in_landing_page() {
	   navigateURL("https://www.amazon.com"); 
	}
   
//I click on the bestseller menu
	@When("I click on the bestseller menu")
	public void i_click_on_the_bestseller_menu() {
	   click(By.linkText("Best Sellers")); 
	}
//I click on the Books menu
	@When("I click on the Books menu")
	public void i_click_on_the_books_menu() {
		click(By.linkText("Books"));
	}
//I enter the seleced book
	@When("I enter the seleced book")
	public void i_enter_the_seleced_book() {
	 sendkeys(By.name("field-keywords"),"chicago manual of style 2022");   
	}
	
//I click on the search icon
	@Then("I click on the search icon")
	public void i_click_on_the_search_icon() {
	    click(By.id("nav-search-submit-button"));
	}
	//I click on the book
	
	@Then("I click on the book")
	public void i_click_on_the_book() {
		click(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//h2/a/span[text()='The Chicago Manual of Style, 17th Edition']"));
	}
	//I click on the add to cart
	@Then("I click on the add to cart")
	public void i_click_on_the_add_to_cart() {
	   click(By.id("add-to-cart-button"));
	}
//I click on the proceed
	@Then("I click on the proceed")
	public void i_click_on_the_proceed() {
	   click(By.name("proceedToRetailCheckout")); 
	}
//I will verify the text
	@Then("I will verify the text")
	public void i_will_verify_the_text() {
	String actualValue=  getElementText(By.xpath(" //h1[@ class='a-spacing-small']"));
	assertEquals("Sign in", actualValue);
	System.out.println("Assertion Done" );
	}

}
