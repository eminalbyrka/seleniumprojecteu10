package com.cydeo.tests;
package com.cybertek.pages;

         import com.cybertek.utilities.Driver;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;

 import org.openqa.selenium.support.FindBy;

 import org.openqa.selenium.support.PageFactory;


public abstract class LibraryLoginPage {



    public Login(){

               PageFactory.initElements(Driver.getDriver(), this);

    }



   @FindBy(id = "inputEmail")

   public String inputEmail;  }


