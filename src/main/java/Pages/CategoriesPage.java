package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
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
    public CategoriesPage selectProductFromCategory(String productFromCategory){

        return this;
    }
}
