package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserSettings extends BaseLibrary {

   @Step("Click on the 'Ayarlar' button")
    public UserSettings clickMySettingsButton(){
        WebElement element=driver.findElements(By.xpath("//*[contains(text(),'Ayarlar')]")).get(0);
        element.click();
        return this;
    }

    @Step("Click on the current password input field and enter the password")
    public UserSettings enterCurrentPassword(String pwd){
       // id="oldPassword"
       driver.findElement(By.id("oldPassword")).sendKeys(pwd);
        return this;
    }

    @Step("Click on the new password input field and enter the new password")
    public UserSettings enterNewPassword(String newPwd){
        // id="password"
        driver.findElement(By.id("password")).sendKeys(newPwd);
        return this;
    }


    @Step("Click on the new password confirmation input field and enter the new password")
    public UserSettings enterNewPasswordConfirmation(){
        //id="password-confirm"
        driver.findElement(By.id("password-confirm")).sendKeys("ecemberkakkavak01New");
        return this;
    }


    @Step("Click on the 'Şifreyi değiştir' button")
    public UserSettings changePassword() throws InterruptedException {
        // //*[contains(text(),'Şifreyi değiştir')] -> 1.index
        WebElement element= driver.findElements(By.xpath("//*[@id=\"main_content\"]/div/section/div/div[2]/div/div[2]/form/div[2]/button")).get(0);
        element.click();
        return this;
    }
}
