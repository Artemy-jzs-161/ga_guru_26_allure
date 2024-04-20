package pages;

import io.qameta.allure.Step;

import static data.TestData.ISSUE;
import static data.TestData.REPOSITORY;

public class WebSteps{

    GitHubPages gitHubPage = new GitHubPages();

    @Step("Открываем главную страницу")
    public void openMainPage() {
        gitHubPage.openPage();
    }

    @Step("Ищем репозиторий " + REPOSITORY)
    public void searchForRepository() {
        gitHubPage.searchForRepository();
    }

    @Step("Кликаем по ссылке репозитория " + REPOSITORY)
    public void clickOnRepositoryLink() {
        gitHubPage.openRepository();
    }

    @Step("Открываем вкладку Issues")
    public void openIssuesTab() {
        gitHubPage.openIssuesTab();
    }

    @Step("Ищем наличие Issue с номером " + ISSUE)
    public void searchForIssue() {
        gitHubPage.searchForIssue();
    }

    @Step("Проверяем наличие Issue с номером" + ISSUE)
    public void shouldSeeIssueWithNumber() {
        gitHubPage.checkIssueNumber();
    }
}
