package com.Trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Trendyol.utilities.Driver;


public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id="accountBtn")
    public WebElement girisYap;






}
