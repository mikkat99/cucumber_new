package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class VerificationStagesPage extends BasePage {
    ProductSearchPage productSearchPage = new ProductSearchPage();
    String firstProductName = productSearchPage.firstProductInSearch();
    String savedNameProduct = productSearchPage.firstProduct;
    @FindBy(xpath = "//span[contains(@class, 'ListingLayout_count')]")
    private WebElement quantityProduct;                      //количество товаров по результату поиска

    @FindBy(xpath = "//a[@class='CardText_link__C_fPZ link_black']/div[@class='CardText_title__7bSbO CardText_listing__6mqXC']")
    private WebElement nameProduct;              //наименование первого товара из поиска

    public void assertQuantityProduct() {                  //отображение ошибки если количество товаров больше 1
        wait.until(visibilityOf(quantityProduct));
        String finalQuantityProduct = quantityProduct.getText();
        Assertions.assertEquals("1 товар", finalQuantityProduct, "Ошибка! В поисковой выдаче не 1 товар");
    }

    public void assertNameProduct() {                 //отображение ошибки при несовпадении наименования товара
        String productName = nameProduct.getText();
        Assertions.assertEquals(savedNameProduct, productName, "Товар введенный в поиск не совпадает с найденным товаром");
    }
}
