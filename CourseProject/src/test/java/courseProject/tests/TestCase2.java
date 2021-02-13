package courseProject.tests;

import com.opencsv.exceptions.CsvException;
import courseProject.base.testUtil;
import courseProject.driverFactory;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SearchResult;
import pages.SearchResultStatisticsPage;
import seleniumUtils.CsvReader;

import java.io.IOException;

@Slf4j

public class TestCase2 extends testUtil {

    public WebDriver driverTest;
    int wait;

    @DataProvider(name = "companyDividends")
    public static Object[][] dataProviderFromCsvFile() throws IOException, CsvException {
        log.info("LOADING");
        return CsvReader.readCsvFile("src/test/resources/companiesDetail.csv");
    }

    @Test(dataProvider = "companyDividends")
    public void searchCompanyDividends(String company, String row,String valueToCompare) throws InterruptedException {
        driverTest = driverFactory.getFirefoxDriver(wait);
        driverTest.get("https://finance.yahoo.com/");

        //search for the company
        SearchResult searchResult = new SearchResult(driverTest);

        searchResult.passBanner(driverTest);
        log.info("after pass banner");
        searchResult.goToSearchResult(company, driverTest);

        searchResult.goToStatistics();

        SearchResultStatisticsPage statisticsPage = new SearchResultStatisticsPage(driverTest);
        String value = statisticsPage.getValueForRow(row);

        Assert.assertEquals(value, valueToCompare);

        if(value.equalsIgnoreCase(valueToCompare)){
            log.info("True");
        }
    }

    @AfterSuite
    public void tearDownDriver(){
        driverTest.quit();
    }
}
