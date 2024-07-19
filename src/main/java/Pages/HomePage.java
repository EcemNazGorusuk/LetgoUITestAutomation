package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseLibrary {
    @Step("Profile Icon Button Is Displayed")
    public HomePage displayProfileIconButton() throws InterruptedException {
        //[class="u8syr"]
        sleepThread(4000);
        WebElement element=driver.findElement(By.cssSelector("[class='u8syr']"));
        if(element.isDisplayed())
            driver.findElement(By.cssSelector("[class='u8syr']")).click();
        return this;
    }


    @Step("Click on the 'İlanlarım' button")
    public HomePage clickMyListingsButton() throws InterruptedException {
        // [class="_1F3nk "]
        sleepThread(4000);
        WebElement element=driver.findElement(By.cssSelector("[class='_1F3nk']"));
        element.click();
        return this;
    }


    @Step("Click on the 'Favoriler' button")
    public HomePage clickFavoritesButton() throws InterruptedException {
        // class="_1CPM7"
        sleepThread(4000);
        WebElement element=driver.findElement(By.cssSelector("[class='_1CPM7']"));
        element.click();
        return this;
    }

    @Step("Check viewing the name field when clicking on the profile icon")
    public HomePage checkViewNameField() throws InterruptedException {
        //[class="_31kC9"]
        String value =driver.findElement(By.cssSelector("[class='_31kC9']")).getText();
        Assert.assertEquals("Ecem Naz Görüşük", value);
        System.out.println(value);
        return this;
    }
}
