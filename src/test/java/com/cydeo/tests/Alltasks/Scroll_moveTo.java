package com.cydeo.tests.Alltasks;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scroll_moveTo {

    @Test

    public void moveTo_test(){
        //        1- Open a chrome browser
        //        2- Go to: https://practice.cydeo.com/

        Driver.getDriver().get("https://practice.cydeo.com/");

       // 3- Scroll down to “Powered by CYDEO”.then "Home"

        Actions actions= new Actions(Driver.getDriver());

        WebElement poweredByCydeoLink= Driver.getDriver().findElement(By.xpath("//a[text()='CYDEO']"));
        WebElement homeLink= Driver.getDriver().findElement(By.xpath("//a[text()='Home']"));

//
          actions.moveToElement(poweredByCydeoLink).perform();
//        actions.moveToElement(homeLink).perform();
//
        //2.yöntem

        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();



    }






}//TC #4: Scroll practice
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/
//        3- Scroll down to “Powered by CYDEO”
//        4- Scroll using Actions class “moveTo(element)” method
//
//
//        TC #5: Scroll practice 2
//        1- Continue from where the Task 4 is left in the same test.
//        2- Scroll back up to “Home” link using PageUP button
