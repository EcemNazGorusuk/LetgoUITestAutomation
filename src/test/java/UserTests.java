import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class UserTests extends BaseTest {
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();

    @Test(description = "Successful User Creation Check")
    public void loginSuccessful() throws InterruptedException {
        mainPage.clickLoginButton();
        mainPage.continueWithEmailAddressButton();
    }
}
