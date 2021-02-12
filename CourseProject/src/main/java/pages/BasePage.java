package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class BasePage {
    protected final WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected <T> T executeOperationWithExplicitWait(long timeoutInSeconds, ExpectedCondition<T> expectedCondition, int implicitWait){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        turnOffImplicitWait(driver);
        T result = wait.until(expectedCondition);
        turnOnImplicitWait (driver, implicitWait);
        return result;
    }

    private static void turnOffImplicitWait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    private static void turnOnImplicitWait(WebDriver driver, int implicitWait){
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
    }

    public void passBanner(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[1];", driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/div/div/div[2]")), 100);
        Thread.sleep(500);
        WebElement accept = driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/div/div/div[2]/div[2]/form/button"));
        accept.click();
    }

    @FindBy(id = "yfin-usr-qry" )
    private WebElement searchBar;

//    @FindBy(xpath = "//*[@id=\"header-search-form\"]/div[2]/div[1]/div/ul[1]/li[1]")

//    @FindBy(xpath = "//*[@id=\"header-search-form\"]/div[2]/div[1]/div/ul[1]/li[1]/div[1]")
//    private WebElement firstOptionFromSuggested;

    @FindBy(xpath = "//*[@id=\"header-desktop-search-button\"]")
    private WebElement clickSearch;

    public void searchBar(String searchWord){
        searchBar.sendKeys(searchWord);
//        firstOptionFromSuggested.click();
        clickSearch.click();
    }
}
