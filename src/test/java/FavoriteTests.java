import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

public class FavoriteTests extends BaseTest {
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage=new ProductDetailPage();
    HomePage homePage =new HomePage();

    @Test(description="Add product to favorites")
    public void addFavoriteProduct() throws InterruptedException {
        loginPage.clickGirisButton();
        sleepThread(3000);

        loginPage.continueWithEmailAddressButton();
        sleepThread(3000);

        loginPage.emailTextControl()
                .fillEmail(email)
                .clickContinueButton();
        sleepThread(3000);

        loginPage.passwordTextControl()
                .welcomeText()
                .fillPassword(password)
                .clickLoginButton();
        sleepThread(3000);

        mainPage.checkSearchByLocation("izmir");
        sleepThread(2000);
        mainPage.selectSearchedCityInLocationBox();
        sleepThread(1000);
        mainPage.fillSearchBar("Araba");
        sleepThread(3000);

        productListPage.clickFirstProductCard();
        sleepThread(3000);

        productDetailPage.clickFavoriteButton();
        homePage.displayProfileIconButton();
        homePage.clickMyListingsButton();
        sleepThread(3000);
        homePage.clickFavoritesButton();

    }
}
