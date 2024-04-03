package pages;

import org.openqa.selenium.By;
import utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;


public class SearchByParametersPage extends BasePage {
    @FindBy(xpath = "//input[(@name='min') and (@class='RangeSelector_input__26nqz range-selector-input')][1]")
    private WebElement fieldMinprice;              //поле с минимальной ценой товара
    public void filterPrice(String minPrice) {      //параметр минимальной цены товара
        fieldMinprice.sendKeys(minPrice);
    }

    public void filterProducer(String producer) {                       //выбор производителя товара
        String xpathProducerName = "//label[contains(@for,'" + producer + "')" +
                " and @class='Checkbox_fakeCheckbox__BrwB1 Checkbox_red__2iX1_ Checkbox_small___nCE3']";
        driver.findElement(By.xpath(xpathProducerName)).click();
    }

    public void elementIsMissing() throws InterruptedException {          //ожидание выполнения поиска
        driver.findElements(By.xpath("//span[contains(@class,'Skeleton_skeleton')]")).isEmpty();
        TimeUnit.SECONDS.sleep(5);
    }
}
