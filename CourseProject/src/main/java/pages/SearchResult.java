package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResult extends BasePage {

    public SearchResult(WebDriver driver) {
        super(driver);
    }

    public void banner(WebDriver driver) throws InterruptedException {
        BasePage banner = new BasePage(driver);
        banner.passBanner(driver);
    }

    public void goToSearchResult(String company, WebDriver driver){
        BasePage search = new BasePage(driver);
        search.searchBar(company);
    }

    @FindBy(xpath = "///*[@id=\"quote-nav\"]/ul/li[4]/a/span")
    WebElement selectStatistics;
    public void goToStatistics (){
        selectStatistics.click();
    }


}
