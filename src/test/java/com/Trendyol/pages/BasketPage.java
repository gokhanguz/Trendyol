package com.Trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage {

    @FindBy(css = "[class='pb-basket-item-price']")
    public WebElement basketPrice;

    @FindBy(className = "i-trash")
    public WebElement deleteproduct;


    @FindBy(xpath = "//button[@class='btn-item btn-remove']")
    public WebElement deleteSil;

    @FindBy(xpath = "//span[contains(text(),'Sepetinizde ürün bulunmamaktad')]")
    public WebElement emptyMessage;



}
