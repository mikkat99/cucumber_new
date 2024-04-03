package steps;

import utils.BasePage;
import io.cucumber.java.en.And;
import pages.VerificationStagesPage;

public class VerificationStagesSteps extends BasePage {
    VerificationStagesPage verificationStagesPage = new VerificationStagesPage();

    @And("^Проверка количества товара в поисковой выдаче")
    public void assertProductQUantity() throws InterruptedException {
        verificationStagesPage.assertQuantityProduct();
    }

    @And("^Проверка, что наименование товара соответствует сохраненному значению")
    public void assertProductName() throws InterruptedException {
        verificationStagesPage.assertNameProduct();
    }
}
