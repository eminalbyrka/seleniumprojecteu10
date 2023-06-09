package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;

import java.util.*;
import java.util.concurrent.*;

public class T4_findElements {

    public static void main(String[] args) {

        //TC #4: FindElements Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        //windows : alt+enter --> press enter again
        //mac     : option + Enter --> press enter again
        List <WebElement> allLinks =  driver.findElements(By.tagName("a"));//burada shortcut kullandı.
        // driver ile başlayan kısmı yazıp alt enter yaptı.
        // birden fazla element olduğu için bunu arraylist olarak store etti.alllinks diye bi ad koydu.


                //4- Print out the number of the links on the page.
                System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links

        //iter yazıp ENTER yapınca aşağıdaki otomatik oluşturuluyor.
        //allLinks.for yazıp enter de aynı şekilde.
        for (WebElement each : allLinks) {

            System.out.println("Text of link: " + each.getText());
            System.out.println("HREF Values: " + each.getAttribute("href"));

        }


    }
}