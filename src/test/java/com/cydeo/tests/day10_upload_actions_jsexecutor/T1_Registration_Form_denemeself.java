package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form_denemeself {

    @Test
    public void registrationFormTest() {


//    TC#1: Registration form confirmation
//    Note: Use JavaFaker OR read from configuration.properties file when possible.


//1. Open browser
//2. Go to website:https://practice.cydeo.com/registration_form
//    Driver.getDriver() --> driver burası bize driveri veriyor. chrome ,firefox vs.
//    Driver utility classtan alıyoruz.
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));//sadece
        //bu sekme 3-4 aşamayı birden yapıyor.open maximize vs.
        //get methodunun içine url yazmalıyız.yani String.
        //burada kafama getdriver birçok stepi yapıyor. nasıl oluyorda.devamına .get ile devam edebiliyoruz sorusu gelmişti.
        //çünkü o methodun sondaki return. type yine driver imiş.

        //NORMALDE BU URL. Yİ CONFİGURATİON.PROPERTİES İÇİNE KOYMAM. AMA ÖRNEK OLSUN DİYE YAPIYORUM DEDİ.
        // URL.Yİ ÖNCE KOPYALADI. PROPERTİES İÇİNE KOYDU. SONRA ORDAN KULLANDI.KEY. İSMİNİ YAZDI SADECE.("registration.form.url")

        //.getproperty ise configurationReader class içindeki bir method.
        // argument olarak.configuration .properties.ten çekiyor.
//3. Enter first name
        Faker faker = new Faker();
        WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        //burada firstname için faker kullanmak için bir üst satıra faker object oluşturdu.
        //ayrıca artık driver yerine Driver.getdriver kullanıyoruz.singleton yapısı bu şekilde.
        inputFirstName.sendKeys(faker.name().firstName());
//4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

//5. Enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String user = faker.bothify("helpdesk###");//random numerify için#, letterify için ? kullanılıyor.
        inputUsername.sendKeys(user);
//6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@email.com");//bu şekilde kullanmak istedi.line 47.user namein başlangıcı olsun dedi.
//7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));
        //System.out.println("faker.internet().password() = " + faker.internet().password());
//8. Enter phone number
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

//9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();//3ünden birini seçti.click yaptı sadece.

//10. Enter date of birth// normal buldu.
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004, 1920)
        inputBirthday.sendKeys("03/08/2000");
//11. Select Department/Office
        Select departmentDropdown= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")) );
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
       // departmentDropdown.selectByVisibleText("Department of Engineering");


//12. Select Job Title

//13. Select programming language from checkboxes

//14. Click to sign up button

//15. Verify success message “You’ve successfully completed registration.” is
//    displayed.


//            Note:
//            1. Use new Driver utility class and method
//2. User JavaFaker when possible
//3. User ConfigurationReader when it makes sense

    }
}