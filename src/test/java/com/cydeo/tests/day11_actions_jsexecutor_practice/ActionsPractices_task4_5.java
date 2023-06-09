package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

public class ActionsPractices_task4_5 {

    @Test
    public void task_4_and_5_test(){

        //TC #4: Scroll practice
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        //Create object of Actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        //Locating cydeo link to be able to pass in the actions method
        //a[@href='https://cydeo.com/']

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();//bu 1. yöntem.aşağıdaki 2. yöntem olabilir. aşağıdaki ayrı bir yöntem. devamı değil
        //bu veya aşağıdaki kullanılacak.

        //5- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();//bu iyi yöntem değil. interview.de bahsedebilirsiniz.
        //moveTo kullanarak yapmak daha mantıklı dedi.

        //Driver.getDriver().quit();
        Driver.closeDriver();

    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test4(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }


}