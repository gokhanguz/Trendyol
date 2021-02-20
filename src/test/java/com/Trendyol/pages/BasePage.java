package com.Trendyol.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Trendyol.utilities.Driver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id="accountBtn")
    public WebElement girisYap;

    public  void printToTxt(String info,String fileName) {
        // you can add dynamic file name idForTxtFile
        String idForTxtFile = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
        File file = new File(fileName + idForTxtFile+".txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            //instead you could only use:
            fw.write(info);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
    }







}
