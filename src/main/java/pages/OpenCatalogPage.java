package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.BasePage;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class OpenCatalogPage extends BasePage {
    @FindBy(xpath = "//button[contains(@class,'Button_primaryRed__SwkFE NavigationBar_burgerButton__PDGsX')]")
    private WebElement catalog;            //меню каталог

    @FindBy(xpath = "//button[contains(@class,'Button_primaryRed__SwkFE NavigationBar_burgerButton__PDGsX')]")
    private WebElement openCatalog;      //кнопка каталог после нажатия


    public void openCatalog() throws InterruptedException {
        loadingBasePage();
        catalog.click();
        wait.until(visibilityOf(openCatalog));                //проверка открытия каталога
        TimeUnit.SECONDS.sleep(3);
    }

    public void openChapter(String Chapter) throws InterruptedException {      //проверка открытия раздела
        String xpathChapter = "//div[text()='" + Chapter + "']/ancestor::a";
        driver.findElement(By.xpath(xpathChapter)).click();
        TimeUnit.SECONDS.sleep(3);
    }

    public void titleChapterOpen(String chapter) {                              //проверка заголовка
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(
                By.xpath("//h1[text()='" + chapter + "']"))));
    }

    public void openSubchapter(String subchapter) throws InterruptedException {   //проверка открытия подраздела
        String xpathSubchapter= "//div/p[contains(text(),'" + subchapter + "')]";
        WebElement subchapterName = driver.findElement(By.xpath(xpathSubchapter));
        subchapterName.click();
        TimeUnit.SECONDS.sleep(3);
    }
}
