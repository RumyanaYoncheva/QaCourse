package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {


    //constructor
    public CreateAccountPage(WebDriver driver){
        super(driver);
    }

    //1 step --> go to AccountDetailsPage

    //2nd step --> acc details finders - insert those details

    //*first name
    @FindBy(id = "usernamereg-firstName")
    WebElement firstName;

    //*last name
    @FindBy(id = "usernamereg-lastName")
    WebElement lastName;

    //*email
    @FindBy(id = "usernamereg-yid")
    WebElement emailAddress;

    //*select the first suggestion for email
    @FindBy(xpath =  "//*[@id=\"desktop-suggestion-list\"]/li[1]")
    WebElement autoSuggestEmail;

    //*password
    @FindBy(id = "usernamereg-password")
    WebElement pass;

    //*phone number / the country code stays by default bulgarian +359 as it is
    @FindBy(id = "usernamereg-phone")
    WebElement phoneNumber;

    //*birth month
    @FindBy(id = "usernamereg-month")
    WebElement birthMonth;

    //*day of birth
    @FindBy(id = "usernamereg-day")
    WebElement dayBirth;

    //*year of birth
    @FindBy(id = "usernamereg-year")
    WebElement yearBirth;

    //insert details to create an account
    public void insertDetailsAboutAcc(String fName, String lName, String email, String password, String phone, String day, String year) {

        firstName.sendKeys(fName);

        lastName.sendKeys(lName);

        //inset email address and choose the recommended one
        emailAddress.sendKeys(email);
        autoSuggestEmail.click();

        //insert password
        pass.click();
        pass.sendKeys(password);

        //insert phone number
        phoneNumber.sendKeys(phone);

        //insert birth month with value 1
        birthMonth.click();
        Select chooseMonthByValue = new Select(birthMonth);
        chooseMonthByValue.selectByValue("1");

        //insert the day
        dayBirth.sendKeys(day);

        //insert the year of birth
        yearBirth.sendKeys(year);
    }

    //create account button click
    @FindBy(id = "reg-submit-button")
    private WebElement createAccButton;

    public void clickCreateAccButton(){
        createAccButton.click();
    }

    @FindBy(xpath = "//*[@id=\"account-attributes-challenge\"]/h1")
    private WebElement headerFromCreateAccPage;
    public String headerFromAccCreationPg(){
        return headerFromCreateAccPage.getText();
    }

    @FindBy(id = "reg-submit-button")
    private WebElement registrationButton;
    public void clickRegisterAcc(){
        registrationButton.click();
    }


}
