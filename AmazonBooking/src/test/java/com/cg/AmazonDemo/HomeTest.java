package com.cg.AmazonDemo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeTest {

	WebDriver driver = null; 
	   @Given("Open Amazon$") 
	   public void goToRegPage() { 
		    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.navigate().to("https://www.amazon.in/ref=nav_logo");
	   }
	   
	   @When("^I enter Search as (.*)$") 
	   public void enterUsername(String arg1) {   
		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.navigate.click();
		   driver.navigate().to("https://www.amazon.in/Sony-inches-Bravia-KLV-24P413D-Ready/dp/B0188YS2CM/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533617515&sr=1-1&keywords=sony+tv");
		   home.navigateto.click();
	   }
	   @Then("^sonyTV Should be added to cart$")
	   public void checkPass() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   
	   @When("^I Search as (.*)$") 
	   public void enterUsername1(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.pb.click();
		   driver.navigate().to("https://www.amazon.in/Boat-Bass-Heads-225-Headphones/dp/B073XGT189/ref=sr_1_2_sspa?s=electronics&ie=UTF8&qid=1533618061&sr=1-2-spons&keywords=earphones&psc=1");
		   home.navigateto.click();
	   }
	   @Then("^ear phones Should be added to cart$")
	   public void checkPass1() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I click Search (.*)$") 
	   public void enterUsername2(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.lava.click();
		   driver.navigate().to("https://www.amazon.in/Lava-Z61-Gold-Full-Display/dp/B07FYCFCSS/ref=sr_1_5?s=electronics&ie=UTF8&qid=1533618328&sr=1-5&keywords=lava");
		   home.navigateto.click();
	   }
	   @Then("^lava Should be added to cart$")
	   public void checkPass2() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I want to buy (.*)$") 
	   public void enterUsername3(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.redmi5.click();
		   driver.navigate().to("https://www.amazon.in/Mi-Redmi-5-Black-32GB/dp/B077PWBC7J/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533615417&sr=1-1&keywords=redmi+5");
		   home.navigateto.click();
	   }
	   @Then("^Redmi5 Should be added to cart$")
	   public void checkPass3() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I wish to Buy (.*)$") 
	   public void enterUsername4(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.collegebag.click();
		   driver.navigate().to("https://www.amazon.in/AUXTER-Polyester-Backpack-AUX_BP_MUSIC-BOY-012/dp/B071RXRCXR/ref=sr_1_1?ie=UTF8&qid=1533618666&sr=8-1&keywords=collegebag");
		   home.navigateto.click();
	   }
	   @Then("^collegebag Should be added to cart$")
	   public void checkPass4() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^All Items are added (.*)$") 
	   public void enterUsername5(String arg1) { 
		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.cart.click();
		   home.checkout.click();
	   }
	   
}
