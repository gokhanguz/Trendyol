package com.Trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage{



    @FindBy(tagName = "h1")
    public WebElement productName;

    @FindBy(css= "div.pd-app-container div.pr-cn:nth-child(2) div.pr-cn-in div.pr-in-w div.pr-in-cn div.pr-bx-w div.pr-bx-dsc div.pr-bx-pr-dsc div:nth-child(2) > span.prc-dsc")
    public WebElement productPrice;

    @FindBy(xpath= "//div[@class='add-to-bs-tx']")
    public WebElement addBasket;
}
