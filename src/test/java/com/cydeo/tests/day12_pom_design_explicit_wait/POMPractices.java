package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.*;
import com.cydeo.tests.utilities.*;
import org.testng.*;
import org.testng.annotations.*;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;//ıa m creating here and
    // instantiating line 16(libraryLoginPage = new LibraryLoginPage();)
    //ekstra bilgi:LibraryLoginPage libraryLoginPage=new LibraryLoginPage(); neden bu
    //Şekilde class içinde yapmıyoruz.çünkü bu durumda bir kere çalışıyor. sonra driver .close driver methodunun içindeki
    //quit session özelliğinden dolayı. tekrar çalışmıyor. o yüzden bunu
    //( libraryLoginPage = new LibraryLoginPage();)her testten önce çalışacak şek,lde before methodunun içine koydu.
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com/");
        libraryLoginPage = new LibraryLoginPage();
    }

    @Test
    public void required_field_error_message_test(){
        //TC #1: Required field error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        //3- Do not enter any information
        //4- Click to “Sign in” button

        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){
        //TC #2: Invalid email format error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        //3- Enter invalid email format

        libraryLoginPage.inputUsername.sendKeys("somethingwrong");

        libraryLoginPage.signInButton.click();
        //we are reaching the web elements through
        //our object of the class.thats why we have to introduce our object.this object somehow know
        //the existing  webelements(public class LibraryLoginPage.bak)
        //bunu sağlayan oradaki bu satır imiş(PageFactory.initElements(Driver.getDriver(), this);


        // 4- Verify expected error is displayed:of these webelements.
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void library_negative_login_test() throws InterruptedException {
        //TC #3: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Enter incorrect username or incorrect password

        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");

        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Thread.sleep(2000);
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        Driver.closeDriver();

    }


}