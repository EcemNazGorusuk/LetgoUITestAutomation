package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesPage extends BaseLibrary {



    @Step("Click on the 'TÜM KATEGORİLER' button")
    public CategoriesPage clickAllCategoriesButton(){
        // [class="_3wAbV"]
        WebElement element = driver.findElement(By.cssSelector("[class='_3wAbV']"));
        element.click();
        return this;
    }

    @Step("A category is selected and clicked from the list of available categories")
    public CategoriesPage selectAndClickCategory(){
        // [class="P9UDC yFQ0R"] -> 3.index
        WebElement element = driver.findElements(By.cssSelector("[class='P9UDC yFQ0R']")).get(3);
        element.click();
        return this;
    }

    @Step("A product belonging to the selected category is chosen from under that category")
    public CategoriesPage selectProductFromCategory(){
        WebElement element =driver.findElements(By.xpath("//*[contains(text(),'Dizüstü Bilgisayar')]")).get(0);
        element.click();
        return this;
    }

    @Step("Filter the product's brand is selected")
    public CategoriesPage filterProductBrand() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//div[@class='rui-TLmk0'][4]"));
        element.click();
        sleepThread(3000);
        return this;
    }

    @Step("The minimum price range is selected")
    public CategoriesPage filterMinimumPriceRange(int price) throws InterruptedException {
        //[class="_2RU4E"]
        WebElement element = driver.findElements(By.cssSelector("[class='_2RU4E']")).get(0);
        element.sendKeys(String.valueOf(price));
        sleepThread(3000);
        return this;
    }

    @Step("The maximum price range is selected")
    public CategoriesPage filterMaximumPriceRange(int price) throws InterruptedException {
        //[class="_2RU4E"]
        WebElement element = driver.findElements(By.cssSelector("[class='_2RU4E']")).get(1);
        element.sendKeys(String.valueOf(price));
        sleepThread(3000);
        return this;
    }

    @Step("Click on the 'Uygula' button")
    public CategoriesPage clickApplyButton()  {
        //[class="rui-apowA rui-E75l5 rui-UGVY0 _39YlX rui-H9g30"]
        WebElement element= driver.findElement(By.cssSelector("[class='rui-apowA rui-E75l5 rui-UGVY0 _39YlX rui-H9g30']"));
        element.click();
        return this;
    }

    @Step("Check for the error message resulting from incorrect price range inputs")
    public CategoriesPage checkPriceRangeError()  {
        // [class="_3lWQO"]
        String value= driver.findElement(By.cssSelector("[class='_3lWQO']")).getText();
        Assert.assertEquals(noListingsFound, value);
        System.out.println(value);
        return this;
    }
}
