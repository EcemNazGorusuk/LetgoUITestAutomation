package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage extends BaseLibrary {

    @Step("Click on the 'Add to Favorites' button")
    public ProductDetailPage clickFavoriteButton(){
        // [class="rui-3a8k1 favoriteOff"]
        // İkinci butona ulaşmak için
        WebElement secondButton = driver.findElement(By.xpath("(//div[@class='nfuKi _2bUlo']//button)[2]"));
        secondButton.click();

        return this;
    }
}
