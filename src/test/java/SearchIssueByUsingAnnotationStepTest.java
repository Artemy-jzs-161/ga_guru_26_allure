import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.WebSteps;


public class SearchIssueByUsingAnnotationStepTest  extends TestBase {
    WebSteps steps = new WebSteps();
    @Test
    @Feature("Issue в репозитории")
    @Story("Поиск Issue")
    @Owner("Artemy-jzs-161")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Поиск Issue с помощью аннотации @Step")
    void testIssueSearchByUsingAnnotationStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        steps.openMainPage();
        steps.searchForRepository();
        steps.clickOnRepositoryLink();
        steps.openIssuesTab();
        steps.searchForIssue();
        steps.shouldSeeIssueWithNumber();
    }
}
