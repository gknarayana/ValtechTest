package com.ddcn;

//import cucumber.api.java.After;
//import cucumber.api.java.Before;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class StepDefs extends CukesRunner {

    WebDriver driver = new FirefoxDriver();



    @Given("^User in Valtech home page$")
    public void launchValtech() {

        driver.get("https://www.valtech.com");
    }


    @When("^Latest News ection is displayed$")
    public void latestNews() {
        assert (driver.findElement(By.cssSelector("#container > div:nth-child(2) > div:nth-child(3)")).isDisplayed());

    }

    @When("^I am in (.*)$")
    public void page(String pageName) {
        switch (pageName) {
            case "CASES": {
                driver.findElement(By.xpath("//span[text()='Work']")).click();
                break;
            }
            case "SERVICES": {
                driver.findElement(By.xpath("//span[text()='Services']")).click();
                break;
            }
            case "JOBS": {
                driver.findElement(By.xpath("//span[text()='Careers']")).click();
                break;
            }
        }

    }

    @When("^H1 should be (.*)$")
    public void h1(String h1Text) {
        assert (driver.findElement(By.xpath("//h1[text()='"+h1Text+"']")).isDisplayed());

    }

    @After
    public void p() {
        driver.quit();
    }

}





