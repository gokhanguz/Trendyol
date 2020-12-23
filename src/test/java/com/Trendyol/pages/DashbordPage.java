package com.Trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashbordPage extends  BasePage{
   

    @FindBy(css = "[class='search-box']")
    public WebElement searchBox;

    @FindBy(css = "  [class='search-icon']")
    public WebElement search;

    @FindBy(css = " [href*='sepetim#/basket']")
    public WebElement mainBasketButton;



}
