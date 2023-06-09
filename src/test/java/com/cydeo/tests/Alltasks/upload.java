package com.cydeo.tests.Alltasks;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class upload {

    @Test
    public void upload_test(){


       // 1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get(" https://practice.cydeo.com/upload ");

        // 2. Find some small file from your computer, and get the path of it.
        String filePath="C:\\Users\\emina\\Desktop\\Screenshot_1.png";

       //  3. Upload the file.

        WebElement chooseFile= Driver.getDriver().findElement(By.id("file-upload"));
        chooseFile.sendKeys(filePath);

        WebElement uploadLink= Driver.getDriver().findElement(By.id("file-submit"));

uploadLink.click();
    }






}/*
TC #2 Upload Test
        1. Go to https://practice.cydeo.com/upload
        2. Find some small file from your computer, and get the path of it.
        3. Upload the file.
        4. Assert:
        -File uploaded text is displayed on the page
 */
