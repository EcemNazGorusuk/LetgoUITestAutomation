import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

public class SettingsTests extends BaseTest {
    LoginPage loginPage=new LoginPage();
    HomePage homePage =new HomePage();
    UserSettings userSettings = new UserSettings();

    @Test(description="Change the account password")
    public void changeAccountPassword() throws InterruptedException {
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

        homePage.displayProfileIconButton();
        sleepThread(1000);
        userSettings.clickMySettingsButton();
        sleepThread(3000);
//
    }
}
