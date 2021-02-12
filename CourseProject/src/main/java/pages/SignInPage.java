package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends BasePage {

    //click Sign-in button on the first page
    @FindBy(id = "header-signin-link")
    private WebElement signInButton;

    //insert username
    @FindBy(id = "login-username" )
    private WebElement username;

    //constructor
    public SignInPage (WebDriver driver){
        super(driver);
    }

    //pass banner
    public void banner(WebDriver driver) throws InterruptedException {
        BasePage banner = new BasePage(driver);
        banner.passBanner(driver);
    }

    //sign in button
    @FindBy(id = "header-signin-link" )
    private WebElement signInButtonBasePage;
    public void goToSignInpage(){
        signInButton.click();
    }

    public void login (String usernameField){
        executeOperationWithExplicitWait(10, ExpectedConditions.visibilityOf(username),10);
        username.sendKeys(usernameField);
    }

    @FindBy(id ="createacc" )
    private WebElement wantToCreateAccountButton;
    public void goToCreateAccPage(){
        wantToCreateAccountButton.click();
    }
}
