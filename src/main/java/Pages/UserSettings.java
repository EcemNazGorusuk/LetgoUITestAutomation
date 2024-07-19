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
        WebElement element=   driver.findElements(By.xpath("//*[contains(text(),'Ayarlar')]")).get(0);
        element.click();
        return this;
    }
}
