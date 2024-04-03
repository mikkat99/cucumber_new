package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.PageFactory.*;
import static utils.DriverManager.getWebDriver;


public class BasePage {
    protected static WebDriver driver = getWebDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, ofSeconds(20));
    @FindBy(xpath = "//a[@class='NavigationBar_mobileLogo__7cHxw']")
    private WebElement loadingIcon;

    public BasePage() {
        initElements(driver, this);
    }

    public void loadingBasePage() {
        wait.until(ExpectedConditions.invisibilityOf(loadingIcon));
    }
}
