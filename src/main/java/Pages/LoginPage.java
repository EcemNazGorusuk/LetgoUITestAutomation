package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseLibrary {

    @Step("Email field is filled")
    public LoginPage fillEmail(String email){
        //LoginPage türündeki metod
        driver.findElement(By.id("login-email")).sendKeys(email);   //idsi login-email olan input alanına mail adresini yazar
        return this;
    }
}
