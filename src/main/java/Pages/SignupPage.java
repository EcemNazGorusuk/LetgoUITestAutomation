package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignupPage extends BaseLibrary {
    @Step("Click on the button named 'Giriş'")
    public SignupPage clickGirisButton(){
        // [class="rui-apowA rui-Ghwwu rui-UGVY0 _2XPqE PrP1G"]
        WebElement element=driver.findElement(By.cssSelector("[class='rui-apowA rui-Ghwwu rui-UGVY0 _2XPqE PrP1G']"));
        element.click();
        return this;
    }

    @Step("Click on the 'E-posta adresiyle devam et' button")
    public SignupPage continueWithEmailAddressButton(){
        // //*[contains(text(),'E-posta adresiyle devam et')]
        WebElement element=  driver.findElement(By.xpath("//*[contains(text(),'E-posta adresiyle devam et')]"));
        element.click();
        return this;
    }


    @Step("Check The Text For 'E-posta adresini gir'")
    public SignupPage emailTextControl(){
        //[class="_2SLog"]
        String value= driver.findElement(By.xpath("//*[contains(text(),'E-posta adresini gir')]")).getText();
        Assert.assertEquals("E-posta adresini gir", value);
        System.out.println(value);
        return this;
    }

    @Step("Email field is filled")
    public SignupPage fillEmail(String email){
        //[id="email_input_field"]
        driver.findElement(By.id("email_input_field")).sendKeys(email);
        return this;
    }


    @Step("Click on the 'Devam et' button")
    public SignupPage clickContinueButton() throws InterruptedException {
        //[class="rui-apowA rui-E75l5 rui-UGVY0 _2sWUW rui-H9g30"]
        WebElement element= driver.findElement(By.cssSelector("[class='rui-apowA rui-E75l5 rui-UGVY0 _2sWUW rui-H9g30']"));
        element.click();
        return this;
    }


    @Step("Customer information text check")
    public SignupPage customerInfoCheck()  throws InterruptedException{
        // [id="data_privacy_tnc"]

        WebElement checkbox = driver.findElement(By.name("data_privacy"));
        boolean isSelected = checkbox.isSelected();

        if (!isSelected) {
            checkbox.click();
            isSelected = checkbox.isSelected();
            Assert.assertTrue("Checkbox should be selected", isSelected);
        }


        sleepThread(3000);
        return this;
    }


    @Step("Customer explicit consent text check")
    public SignupPage customerExplicitConsentCheck()  throws InterruptedException{
        //[id="data_privacy_consent_tnc_consent"]
        WebElement checkbox = driver.findElement(By.name("data_privacy_consent"));
        boolean isSelected = checkbox.isSelected();

        if (!isSelected) {
            checkbox.click();
            isSelected = checkbox.isSelected();
            Assert.assertTrue("Checkbox should be selected", isSelected);
        }


        sleepThread(3000);
        return this;
    }


    @Step("Approval text check")
    public SignupPage approvalTextCheck()  throws InterruptedException{
        // [id="marketing_email"]
        WebElement checkbox = driver.findElement(By.name("marketing"));
        boolean isSelected = checkbox.isSelected();

        if (!isSelected) {
            checkbox.click();
            isSelected = checkbox.isSelected();
            Assert.assertTrue("Checkbox should be selected", isSelected);
        }


        sleepThread(3000);
        return this;
    }


    @Step("Click on the 'Devam et' button")
    public SignupPage clickContinueSignupButton() throws InterruptedException {
        //[class="rui-apowA rui-E75l5 rui-UGVY0 _3yBws _3q_PN"]
        WebElement element= driver.findElement(By.cssSelector("[class='rui-apowA rui-E75l5 rui-UGVY0 _3yBws _3q_PN']"));
        element.click();
        return this;
    }
}
