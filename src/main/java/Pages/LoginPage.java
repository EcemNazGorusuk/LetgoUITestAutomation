package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseLibrary {

    @Step("Click on the button named 'Giriş'")
    public LoginPage clickGirisButton(){
        // [class="rui-apowA rui-Ghwwu rui-UGVY0 _2XPqE PrP1G"]
        WebElement element=driver.findElement(By.cssSelector("[class='rui-apowA rui-Ghwwu rui-UGVY0 _2XPqE PrP1G']"));
        element.click();
        return this;
    }

    @Step("Click on the 'E-posta adresiyle devam et' button")
    public LoginPage continueWithEmailAddressButton(){
        // //*[contains(text(),'E-posta adresiyle devam et')]
        WebElement element=  driver.findElement(By.xpath("//*[contains(text(),'E-posta adresiyle devam et')]"));
        element.click();
        return this;
    }


    @Step("Check The Text For 'E-posta adresini gir'")
    public LoginPage emailTextControl(){
        //[class="_2SLog"]
        String value= driver.findElement(By.xpath("//*[contains(text(),'E-posta adresini gir')]")).getText();
        Assert.assertEquals("E-posta adresini gir", value);
        System.out.println(value);
        return this;
    }

    @Step("Email field is filled")
    public LoginPage fillEmail(String email){
        //[id="email_input_field"]
        driver.findElement(By.id("email_input_field")).sendKeys(email);
        return this;
    }


    @Step("Click on the 'Devam et' button")
    public LoginPage clickContinueButton() throws InterruptedException {
        //[class="rui-apowA rui-E75l5 rui-UGVY0 _2sWUW rui-H9g30"]
        WebElement element= driver.findElement(By.cssSelector("[class='rui-apowA rui-E75l5 rui-UGVY0 _2sWUW rui-H9g30']"));
        element.click();
        return this;
    }

    @Step("Check The Text For 'Şifreni gir'")
    public LoginPage passwordTextControl(){
        // //*[contains(text(),'Şifreni gir')]
        String value = driver.findElement(By.cssSelector("[class='_2SLog'] span")).getText();
        Assert.assertEquals("Şifreni gir", value);
        System.out.println(value);
        return this;
    }

    @Step("Welcome back message check")
    public LoginPage welcomeText(){
        // [class="_3-fMc"]
        String value= driver.findElement(By.cssSelector("[class='_3-fMc']")).getText();
        Assert.assertEquals("Tekrar hoş geldin ecemnazgorusuk@gmail.com", value);
        System.out.println(value);
        return this;
    }


    @Step("Password field is filled")
    public LoginPage fillPassword(String password){
       //[id="password"]
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }


    @Step("Click on the 'Giriş Yap' button")
    public LoginPage clickLoginButton() throws InterruptedException {
        //[class="rui-apowA rui-E75l5 rui-UGVY0 _2sWUW rui-H9g30"]
        WebElement element= driver.findElement(By.cssSelector("[class='rui-apowA rui-E75l5 rui-UGVY0 _2sWUW rui-H9g30']"));
        element.click();
        return this;
    }

    @Step("Error message check")
    public LoginPage getErrorMessage(String errMsgPassword){
        //[class="rui-IlMwo rui-DTzlG"]
        String value= driver.findElement(By.cssSelector("[class='rui-IlMwo rui-DTzlG']")).getText();
        Assert.assertEquals(errMsgPassword, value);
        System.out.println(value);
        return this;
    }
}
