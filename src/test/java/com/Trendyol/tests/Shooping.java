package com.Trendyol.tests;

import com.Trendyol.pages.*;
import com.Trendyol.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Shooping extends TestBase {


    @Test
    public void shop() throws IOException {

        LoginPage loginPage=new LoginPage();
        loginPage.close.click();
        BrowserUtils.hover(loginPage.girisYap);
        loginPage.login.click();
        BrowserUtils.waitFor(2);

        loginPage.login();
        BrowserUtils.waitFor(2);

        new DashbordPage().searchBox.sendKeys("bilgisayar",Keys.ENTER);
        BrowserUtils.waitFor(2);
        new ProductListPage().product.click();
        BrowserUtils.waitFor(4);


        String productNa=new ProductDetailPage().productName.getText();
        String productPri=new ProductDetailPage().productPrice.getText();
        System.out.println("productPri = " + productPri);

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",new ProductDetailPage().addBasket);
        BrowserUtils.waitFor(2);
        new ProductDetailPage().addBasket.click();
        BrowserUtils.waitFor(2);

        new DashbordPage().mainBasketButton.click();
        BrowserUtils.waitFor(2);

        String basketPri=new BasketPage().basketPrice.getText();
        System.out.println("basketPri = " + basketPri);

        Assert.assertTrue(basketPri.contains(productPri));

        new BasketPage().deleteproduct.click();
        new BasketPage().deleteSil.click();
        BrowserUtils.waitFor(2);
        String actual=new BasketPage().emptyMessage.getText();
        System.out.println("actual = " + actual);

        Assert.assertEquals(actual,"Sepetinizde ürün bulunmamaktadır.");


        String file="info.txt";
       // File fc=new File(file);
        //fc.createNewFile();

        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write(productNa);
        fileWriter.flush();
        fileWriter.write(productPri);
        fileWriter.close();

      /*BufferedWriter bw=new BufferedWriter(fileWriter);
        bw.write(productNa);
        bw.newLine();
        bw.write(productPri);
        bw.close();

       */




    }
}
