package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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


    @Step("Search by selecting location check")
    public MainPage checkSearchByLocation(String locationTitle) throws InterruptedException{
        // [class="_1dasd"]
        driver.findElement(By.cssSelector("[class='_1dasd']")).sendKeys(locationTitle);
        return this;
    }


    @Step("The searched city is selected within the location box")
    public MainPage selectSearchedCityInLocationBox() throws InterruptedException{
        //[class="_3_Rdm"]
        driver.findElement(By.cssSelector("[class='_3_Rdm']")).click();
        return this;
    }


    @Step("Search is performed")
    public MainPage fillSearchBar(String searchText){
        //[data-testid="suggestion"]
        WebElement element = driver.findElement(By.xpath("//*[@id='container']/header/div/div/div[2]/div/div/div[2]/div/form/fieldset/div/input"));
        element.sendKeys(searchText, Keys.ENTER);
        return this;
    }

   @Step("The select box is closed after the selection process is completed")
    public MainPage closeSelectBox(){
       WebElement emptySpaceElement = driver.findElement(By.xpath("//body")); // Veya uygun boş alanın XPath'ini kullanın
       emptySpaceElement.click();
       return this;
   }




}
