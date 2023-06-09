package com.cydeo.tests.Alltasks;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollWithJavascript2 {
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/infinite_scroll

@Test
    public void task6_test(){
//    1- Open a chrome browser
//    2- Go to: https://practice.cydeo.com/infinite_scroll

    Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
//    3- Use below JavaScript method and scroll
//    JavaScript method to use : window.scrollBy(0,0)
//    a.  750 pixels down 10 times.
//            b.  750 pixels up 10 times


    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    for (int i = 0; i <9 ; i++) {
        BrowserUtils.sleep(1);
        js.executeScript("window.scrollBy(0,50)");

    }
   // js.executeScript("window.scrollBy(0,750)");

}




}
/*
TC #6: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/infinite_scroll
3- Use below JavaScript method and scroll
a.  750 pixels down 10 times.
b.  750 pixels up 10 times

JavaScript method to use : window.scrollBy(0,0)
 */
