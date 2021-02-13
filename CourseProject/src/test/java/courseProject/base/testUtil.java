package courseProject.base;

import courseProject.driverFactory;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Slf4j

public class testUtil {
    private String url;
    private int implicitWait;
    public WebDriver driver;


    @BeforeSuite
    public void readConfigProperties(){
        try(FileInputStream configFile = new FileInputStream("src/test/resources/config.properties")) {
            Properties config = new Properties();
            config.load(configFile);
            url = config.getProperty("urlAddressTestCase1");
            implicitWait = Integer.parseInt(config.getProperty("implicitWait"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @BeforeTest
    @Parameters ({"browserType"})
    public void login(String browserType){
        try {
            if (browserType.equalsIgnoreCase("firefox")) {
                driver = driverFactory.getFirefoxDriver(implicitWait);
                loadUrl();

            } else {
                driver = driverFactory.getChromeDriver(implicitWait);
                loadUrl();
            }
        }catch (WebDriverException e){
            log.info(e.getMessage());
        }
    }
    private void loadUrl(){
        driver.get(url);
    }

    @AfterTest
    public void tearDownDriver(){
        driver.quit();
    }
}
