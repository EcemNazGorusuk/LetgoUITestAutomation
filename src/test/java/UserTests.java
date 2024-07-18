import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.SignupPage;
import org.testng.annotations.Test;

public class UserTests extends BaseTest {
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    SignupPage signupPage =new SignupPage();
    HomePage homePage=new HomePage();

    @Test(description = "Successful User Creation Check")
    public void loginSuccessful() throws InterruptedException {
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

        homePage.checkViewNameField();
    }


    @Test(description ="Invalid user login check")
    public void notValidLoginWithWrongPassword() throws InterruptedException {
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
                .fillPassword("123456") //Error is expected
                .clickLoginButton();
        sleepThread(3000);
        loginPage.getErrorMessage(errMsgPassword);
    }



    @Test(description ="Check the transition from the login process with incorrect email to the sign-up process")
    public void notValidLoginWithEMailOccursSignUp() throws InterruptedException {
        signupPage.clickGirisButton();
        sleepThread(3000);

        signupPage.continueWithEmailAddressButton();
        sleepThread(3000);

        signupPage.emailTextControl()
                .fillEmail("newemail@gmail.com")
                .clickContinueButton();
        sleepThread(3000);

        signupPage.customerInfoCheck();
        signupPage.customerExplicitConsentCheck();
        signupPage .approvalTextCheck();
        sleepThread(2000);
        signupPage.clickContinueSignupButton();
    }

}
