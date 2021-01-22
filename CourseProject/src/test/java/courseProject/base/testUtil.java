package courseProject.base;

import courseProject.driverFactory;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

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

    private void setUpBrowserDriver(){
        driver = driverFactory.getFirefoxDriver(implicitWait);
    }

    private void loadUrl(){
        driver.get(url);
    }

    @BeforeTest
    public void initTest(){
        setUpBrowserDriver();
        loadUrl();
    }

}
