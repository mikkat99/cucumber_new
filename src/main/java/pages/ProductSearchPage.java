package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;


public class ProductSearchPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(), 'по 24')]")    //пагинация
    private WebElement pangination;

    //наименование первого товара из списка
    @FindBy(xpath = "//a[@class='CardText_link__C_fPZ link_black']/div[@class='CardText_title__7bSbO CardText_listing__6mqXC']")

    private WebElement firstProductFromTheList;
    String firstProduct = firstProductFromTheList.getAttribute("title");
    @FindBy(xpath = "//input[@id='searchInput']")                  //строка поиска
    private WebElement searchInput;

    public void assertPagination() {
        String pagination = pangination.getText();               //проверка 24 товаров на странице
        Assertions.assertEquals("по 24", pagination, "Ошибка!!! Товаров на странице не 24");
    }
    public String firstProductInSearch() {
        return firstProduct;
    }

    public void searchFirstProduct() throws InterruptedException {
        searchInput.sendKeys(firstProduct);                  //ввод скопированного наименования товара из списка в поле поиска
        searchInput.sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(3);
    }
}
