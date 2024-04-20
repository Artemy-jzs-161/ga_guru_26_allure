import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubPages;


public class SearchIssueByUsingSelenide extends TestBase{
    GitHubPages gitHubPages = new GitHubPages();

    @Test
    @Feature("Issue в репозитории")
    @Story("Поиск Issue")
    @Owner("Artemy-jzs-161")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Поиск Issue с помощью Selenide")
    void testIssueSearchByUsingSelenide() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        gitHubPages
                .openPage()
                .searchForRepository()
                .openRepository()
                .openIssuesTab()
                .searchForIssue()
                .checkIssueNumber();
    }
}
