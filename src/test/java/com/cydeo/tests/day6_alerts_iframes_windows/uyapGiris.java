package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class uyapGiris {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //Do browser driver setup
        //Open browser
        driver = WebDriverFactory.getDriver("chrome");

        //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void selenium_test(){

        //1.Get https://vatandas.uyap.gov.tr/main/vatandas/giris.jsp
        driver.get("https://vatandas.uyap.gov.tr/main/vatandas/giris.jsp");


        //2. Click to e devlet giriş button
        WebElement edevletButton = driver.findElement(By.xpath("//strong[text()='E-Devlet Aracılığıyla Giriş']"));
        edevletButton.click();

        //3. Enter tcNo:
        WebElement tcNo = driver.findElement(By.cssSelector("input[name='tridField']"));
        tcNo.sendKeys("34261934484");
        //4.enter password

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("Hatay31a");
        //5. Click to giris yap button
        WebElement girisyapbutton= driver.findElement(By.cssSelector("input[class='submitButton']"));
        girisyapbutton.click();

        //6.find and click sorgulama işlemleri
//        WebElement sorgulamaislemleri= driver.findElement(By.cssSelector("span[title='Sorgulama İşlemleri']"));
//        sorgulamaislemleri.click();

       // WebElement dosyaSorgulama= driver.findElement(By.cssSelector("img[alt src='/assets/themes/layout/img/sidebar-toggle-light.png']"));
        //dosyaSorgulama.click();

    }






}
