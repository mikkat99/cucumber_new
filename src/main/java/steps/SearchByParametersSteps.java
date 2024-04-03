package steps;

import io.cucumber.java.en.And;
import pages.SearchByParametersPage;


public class SearchByParametersSteps {
    SearchByParametersPage searchByParametersPage = new SearchByParametersPage();

    //   Задать параметр поиска по
    @And("^Установка минимальной цены \"([^\"]*)\"$")
    public void selectPrice(String minPrice) throws InterruptedException {
        searchByParametersPage.filterPrice(minPrice);
    }

    @And("^Выбор производителя \"([^\"]*)\"$")
    public void selectCompany(String producerName) throws InterruptedException {
        searchByParametersPage.filterProducer(producerName);
    }

    @And("^Проверка завершения загрузки")
    public void loading() throws InterruptedException {
        searchByParametersPage.elementIsMissing();
    }
}
