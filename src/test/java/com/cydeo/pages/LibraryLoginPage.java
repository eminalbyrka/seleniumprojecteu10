package com.cydeo.pages;
import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LibraryLoginPage {

    //#1- initialize the driver instance and object of the class
    public LibraryLoginPage(){//burada constructor oluşturdu.
        /*initElements method will create connection in between the current
        driver session (instance) and the object of the current class.
        this means every time  ı have to use any web element ı store in the loginpage.java.ı have to create
        the object of the loginpage .java. ı will be storing everything about page in this class but ı am ganna
        create the object in another class everytime.my object will know how to pass around my session.
         */
        PageFactory.initElements(Driver.getDriver(), this);//"this" is referring the object of the class.(line 6.public class LibraryLoginPage )
    }//everytime ı create an object of this class in another package or in another class.the first thing
    // will happen is my constructor will come
    //here and call this line.in this line we are creating a new session id.to be able to use to pageobject model, we should
    //pass this session inside of this object(libraryLoginPage = new LibraryLoginPage();)
    // we do it by using    PageFactory.initElements(Driver.getDriver(), this)
    //this methods says get me the current driver session and pass it into this object.(line 16.("this")after this line
    //we can call this line again and again.libraryLoginPage = new LibraryLoginPage();
    //because we are terminating, killing the session with Driver.closeDriver();method.

    //#2- use @FindBy annotation to locate web elements

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[@class=\"mb-4\"]/div")
    public WebElement wrongEmailOrPasswordErrorMessage;



}