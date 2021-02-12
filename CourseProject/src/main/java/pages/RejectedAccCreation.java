package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Slf4j

public class RejectedAccCreation extends CreateAccountPage {

    public RejectedAccCreation(WebDriver driver) {
        super(driver);
    }

    public String headerFromRejected(){
        WebElement header = driver.findElement(By.xpath("//*[@id=\"account-attributes-challenge\"]/h1"));
        log.info(header.getText());
        return header.getText();
    }



}
