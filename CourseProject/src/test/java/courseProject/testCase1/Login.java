package courseProject.testCase1;

import com.opencsv.exceptions.CsvException;
import courseProject.base.testUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import seleniumUtils.CsvReader;

import java.io.IOException;

public class Login extends testUtil {

    @DataProvider(name = "login")
    public static Object[][] dataProviderFromCsvFile() throws IOException, CsvException {
        return CsvReader.readCsvFile("src/test/resources/details.csv");
    }

    @Test(dataProvider  = "login")
    public void createAccount(String user, String fName, String lName, String email, String password, String phone, String month, String day, String year) throws InterruptedException {

        passBanner(); //pass the banner

        //click Sign-in button on the first page
        WebElement signInButton = driver.findElement(By.id("header-signin-link"));
        signInButton.click();

        //insert username
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys(user);

        //click CreateAccount button
        WebElement nextButton = driver.findElement(By.id("createacc"));
        nextButton.click();

        insertDetailsAboutAcc(fName, lName, email, password, phone, month, day, year); //insert all the details about the account

        Thread.sleep(5000);

        //create account button
        WebElement continueButton = driver.findElement(By.id("reg-submit-button"));
        continueButton.click();

        Thread.sleep(6000);
    }

    public void passBanner() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/div/div/div[2]")), 100);
        Thread.sleep(500);
        WebElement accept = driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/div/div/div[2]/div[2]/form/button"));
        accept.click();
    }

    public void insertDetailsAboutAcc(String fName, String lName, String email, String password, String phone, String month, String day, String year){

        //insert First Name
        WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
        firstName.sendKeys(fName);

        //insert Last Name
        WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
        lastName.sendKeys(lName);

        //inset email address and choose the recommended one
        WebElement emailAddress = driver.findElement(By.id("usernamereg-yid"));
        emailAddress.sendKeys(email);
//        WebElement autoSuggest = driver.findElement(By.xpath("//*[@id=\"desktop-suggestion-list\"]/li[1]"));
//        autoSuggest.click();

        //insert password
        WebElement pass = driver.findElement(By.id("usernamereg-password"));
        pass.click();
        pass.sendKeys(password);

        //insert phone number
        WebElement phoneNumber = driver.findElement(By.id("usernamereg-phone"));
        phoneNumber.sendKeys(phone);

        //insert birth month with value 1
        WebElement birthMonth = driver.findElement(By.id("usernamereg-month"));
        birthMonth.click();
        Select chooseMonthByValue = new Select(driver.findElement(By.id("usernamereg-month")));
        chooseMonthByValue.selectByValue(month);

        //insert the day
        WebElement dayOfMonth = driver.findElement(By.id("usernamereg-day"));
        dayOfMonth.sendKeys(day);

        //insert the year
        WebElement birthYear = driver.findElement(By.id("usernamereg-year"));
        birthYear.sendKeys(year);
    }

    @AfterTest
    public void tearDownDriver(){
        driver.quit();
    }
}
