package courseProject.tests;

import com.opencsv.exceptions.CsvException;
import courseProject.base.testUtil;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.RejectedAccCreation;
import pages.SignInPage;
import seleniumUtils.CsvReader;

import java.io.IOException;

@Slf4j
public class TestCase1 extends testUtil {

    @DataProvider(name = "login")
    public static Object[][] dataProviderFromCsvFile() throws IOException, CsvException {
        return CsvReader.readCsvFile("src/test/resources/details.csv");
    }

    @Test(dataProvider = "login")
    public void createAccountFireFox(String username, String fName, String lName, String email, String password, String phone, String day, String year) throws InterruptedException {

        //sign in
        SignInPage signInPage = new SignInPage(driver);

        signInPage.banner(driver);
        signInPage.goToSignInpage();
        signInPage.login(username);
        signInPage.goToCreateAccPage();

        //create acc
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.insertDetailsAboutAcc(fName, lName, email, password, phone, day, year);
        createAccountPage.clickCreateAccButton();
        createAccountPage.clickRegisterAcc();

        RejectedAccCreation rejectedAccCreation = new RejectedAccCreation(driver);
        CreateAccountPage headerToCompare = new CreateAccountPage(driver);

        //hard assert
        Assert.assertEquals(rejectedAccCreation.headerFromRejected(),headerToCompare.headerFromAccCreationPg());

        if (rejectedAccCreation.headerFromRejected().equalsIgnoreCase(headerToCompare.headerFromAccCreationPg())) {
            log.info("True");
        }

    }
}
