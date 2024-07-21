import Base.BaseTest;
import Pages.CategoriesPage;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class CategoryTests extends BaseTest {

    LoginPage loginPage=new LoginPage();
    CategoriesPage categoriesPage = new CategoriesPage();
    MainPage mainPage = new MainPage();

    @Test(description="Filtering products by selected category")
    public void filterProductsBySelectedCategory() throws InterruptedException {
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

        mainPage.checkSearchByLocation("Ankara");
        sleepThread(3000);

        mainPage.selectSearchedCityInLocationBox();

        sleepThread(3000);
        categoriesPage.clickAllCategoriesButton();

        sleepThread(3000);
        mainPage.closeSelectBox();

        categoriesPage.selectAndClickCategory();
        sleepThread(3000);

        categoriesPage.selectProductFromCategory();

        categoriesPage.filterProductBrand();
        categoriesPage.filterMinimumPriceRange(500);
        categoriesPage.filterMaximumPriceRange(2000);
        categoriesPage.clickApplyButton();
        sleepThread(3000);

    }


    @Test(description="Check for errors in filtering by the selected category")
    public void checkFilteringRangeErrorBySelectedCategory() throws InterruptedException {
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

        mainPage.checkSearchByLocation("Ankara");
        sleepThread(3000);

        mainPage.selectSearchedCityInLocationBox();

        sleepThread(3000);
        categoriesPage.clickAllCategoriesButton();

        sleepThread(3000);
        mainPage.closeSelectBox();

        categoriesPage.selectAndClickCategory();
        sleepThread(3000);

        categoriesPage.selectProductFromCategory();

        categoriesPage.filterProductBrand();
        categoriesPage.filterMinimumPriceRange(5000);
        categoriesPage.filterMaximumPriceRange(200);
        categoriesPage.clickApplyButton();
        sleepThread(3000);
        categoriesPage.checkPriceRangeError();
    }

}
