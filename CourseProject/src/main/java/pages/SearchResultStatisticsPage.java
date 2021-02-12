package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

        //find table by xpath
//        WebElement table = driver.findElement(By.xpath("//*[@id=\"Col1-0-KeyStatistics-Proxy\"]/section/div[2]/div[2]/div[1]/div[3]/div/div/table/tbody"));
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        //count the rows
//        int rowsCount = rows.size();
//
//        String value = null;
//
//        //iterate rows of table
//        for (int i = 0; i < rowsCount; i++) {
//            //count columns
//            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
//            //iterate columns of table
//            int columnsCount = columns.size();
//            for (int j = 0; j < columnsCount; j++) {
//                String valueString = String.format(VALUE_TO_COMPARE, i,j);
//                //get cell value txt
//                if(valueString.equalsIgnoreCase(text)){
//                    value = columns.get(j).getText();
//                }
//            }
//
//        }

        //value xpath
        String xpathFormattedValue = String.format(ROW_VALUE_DIVIDENDS_AND_SPLITS_SECTION, rowNumber);

        //get value from element
        WebElement getValue = driver.findElement(By.xpath(xpathFormattedValue));
        String value = getValue.getText();

        return value;
    }

}
