package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultStatisticsPage extends SearchResult{

    private static final String DIVIDENDS_AND_SPLITS_SECTION = "//*[@id=\"Col1-0-KeyStatistics-Proxy\"]/section/div[2]/div[2]/div/div[3]/div/div/table/tbody/tr[%s]/td[1]";
    private static final String ROW_VALUE_DIVIDENDS_AND_SPLITS_SECTION = "//*[@id=\"Col1-0-KeyStatistics-Proxy\"]/section/div[2]/div[2]/div/div[3]/div/div/table/tbody/tr[%s]/td[2]";
    private static final String VALUE_TO_COMPARE = "//*[@id=\"Col1-0-KeyStatistics-Proxy\"]/section/div[2]/div[2]/div[1]/div[3]/div/div/table/tbody/tr[%d]/td[%d]/span";

    public SearchResultStatisticsPage(WebDriver driver) {
        super(driver);
    }

    public String getValueForRow (String rowNumber){

        //scroll to element
        String xpathFormattedRow = String.format(DIVIDENDS_AND_SPLITS_SECTION, rowNumber);
        JavascriptExecutor scrollToElement = (JavascriptExecutor) driver;
        scrollToElement.executeScript("arguments[0].click;",driver.findElement(By.xpath(xpathFormattedRow)));

        //value xpath
        String xpathFormattedValue = String.format(ROW_VALUE_DIVIDENDS_AND_SPLITS_SECTION, rowNumber);

        //get value from element
        WebElement getValue = driver.findElement(By.xpath(xpathFormattedValue));
        String value = getValue.getText();

        return value;
    }

}
