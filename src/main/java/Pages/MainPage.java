package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseLibrary {



    @Step("Cookie Notification Control")
    public MainPage closeCokieNotificationButton() throws InterruptedException {
        // [class="onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon"]
        sleepThread(4000);
        WebElement element=driver.findElement(By.cssSelector("[class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']"));
        if(element.isDisplayed())
            driver.findElement(By.cssSelector("[class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
        return this;
    }


}
