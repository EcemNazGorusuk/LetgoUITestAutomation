package Pages;


import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductListPage extends BaseLibrary {

    @Step("Click on the first product in the product list")
    public ProductListPage clickFirstProductCard(){
        // //*[@id="main_content"]/div/div/section/div/div/div[4]/div[2]/div/div[2]/ul/li[1]
        WebElement element= driver.findElements(By.xpath("//*[@id=\"main_content\"]/div/div/section/div/div/div[4]/div[2]/div/div[2]/ul/li[1]")).get(0);
        element.click();
        return this;
    }
}
