package steps;

import io.cucumber.java.en.And;
import pages.ProductSearchPage;


public class ProductSearchSteps {

    ProductSearchPage productSearchPage = new ProductSearchPage();

    @And("^Проверить,что в поисковой выдаче не более 24 товаров")
    public void checkPaginator() throws InterruptedException {
        productSearchPage.assertPagination();
    }

    @And("^Ввод названия первого найденного товара в поисковую строку")
    public void enterNameInSearchField() throws InterruptedException {
        productSearchPage.searchFirstProduct();
    }
}
