package com.Trendyol.pages;

import com.Trendyol.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListPage extends BasePage {


    WebDriver driver;

    @FindBy(css = "[data-id='31683559']")
    public WebElement product;


    public void selectProduct(long number){

        String locater="[href*='"+number+"']";
        driver.findElement(By.cssSelector(locater)).click();

    }
}
