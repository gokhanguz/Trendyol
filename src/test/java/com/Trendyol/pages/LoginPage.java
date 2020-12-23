package com.Trendyol.pages;

import com.Trendyol.utilities.Driver;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage extends BasePage{

     @FindBy(xpath = "//div[contains(text(),'Giriş Yap')]")
      public WebElement login;

     @FindBy(css = "[title='Close']")
    public WebElement close;

     @FindBy(id = "login-email")
    public  WebElement emailBox;

    @FindBy(id = "login-password-input")
    public  WebElement passwordBox;

    @FindBy(css = "[type='submit']")
    public WebElement submitButton;


    public void login() throws IOException {
        String path="src/test/resources/trendyol.xlsx";
        FileInputStream excelFile= new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(excelFile);
        Sheet sheet =workbook.getSheet("Sheet1");

        String email=sheet.getRow(1).getCell(0).toString();
        String password=sheet.getRow(1).getCell(1).toString();

        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        submitButton.click();


    }

}
