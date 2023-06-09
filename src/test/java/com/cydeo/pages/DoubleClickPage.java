package com.cydeo.tests.pages;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DoubleClickPage {//first thing ı do here is constructor.

    public DoubleClickPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "demo")
    public WebElement textToDoubleClick;

}