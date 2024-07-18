package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseLibrary {

    @Step("Click on the button named 'Giriş'")
    public MainPage clickLoginButton(){
         // [class="rui-apowA rui-Ghwwu rui-UGVY0 _2XPqE PrP1G"]
         WebElement element=driver.findElement(By.cssSelector("[class='rui-apowA rui-Ghwwu rui-UGVY0 _2XPqE PrP1G']"));
         element.click();
         return this;
    }

    @Step("Cookie Notification Control")
    public MainPage closeCokieNotificationButton() throws InterruptedException {
        // [class="onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon"]
        sleepThread(4000);
        WebElement element=driver.findElement(By.cssSelector("[class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']"));
        if(element.isDisplayed())
            driver.findElement(By.cssSelector("[class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
        return this;
    }

    @Step("Click on the 'E-posta adresiyle devam et' button")
    public MainPage continueWithEmailAddressButton(){
        // //*[contains(text(),'E-posta adresiyle devam et')]
        WebElement element=  driver.findElements(By.xpath("//*[contains(text(),'E-posta adresiyle devam et')]")).get(0);
        element.click();
        return this;
    }
}
