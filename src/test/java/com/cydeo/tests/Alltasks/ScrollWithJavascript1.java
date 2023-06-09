package com.cydeo.tests.Alltasks;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollWithJavascript1 {
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/large
@Test
    public void task7_test(){
        Driver.getDriver().get("https://practice.cydeo.com/large");

        //3- Scroll down to “Cydeo” link


        WebElement homeLink=Driver.getDriver().findElement(By.xpath("//a[text()='Home']"));
        WebElement cydeoLink=Driver.getDriver().findElement(By.xpath("//a[text()='CYDEO']"));

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();//Down-casting our driver type to JavascriptExecutor,
        // so we are able to use the methods coming from that interface
        BrowserUtils.sleep(2);

        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);
        //cydeoLink,A,B filan olsaydı.argument[1] diye değişecekti.yani hangi linke kadar gitmek istiyorsak onu
        //yazıyoruz.


      //  4- Scroll up to “Home” link

        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink  );



            }






}
/*
TC #7: Scroll using JavascriptExecutor
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/large
        3- Scroll down to “Cydeo” link
        4- Scroll up to “Home” link
        5- Use below provided JS method only

        JavaScript method to use : arguments[0].scrollIntoView(true)

        Note: You need to locate the links as web elements and pass them as
        arguments into executeScript() method

 */