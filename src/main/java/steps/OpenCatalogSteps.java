package steps;

import io.cucumber.java.en.And;
import pages.OpenCatalogPage;


public class OpenCatalogSteps {
    OpenCatalogPage openCatalogPage = new OpenCatalogPage();

    @And("Открытие меню 'Каталог'")
    public void openCatalog() throws InterruptedException {
        openCatalogPage.openCatalog();
    }

    @And("^Открытие раздела  \"([^\"]*)\" и проверка открытия")
    public void openChapter(String chapter) throws InterruptedException {
        openCatalogPage.openChapter(chapter);
        openCatalogPage.titleChapterOpen(chapter);
    }

    @And("^Открытие подраздела  \"([^\"]*)\" и проверка открытия подраздела")
    public void openSubchapter(String subChapter) throws InterruptedException {
        openCatalogPage.openSubchapter(subChapter);
    }
}
