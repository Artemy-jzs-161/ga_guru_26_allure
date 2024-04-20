package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static data.TestData.ISSUE;
import static data.TestData.REPOSITORY;
import static org.openqa.selenium.By.linkText;


public class GitHubPages {

    private final SelenideElement searchInput = $(".search-input"),
            searchQuery = $("#query-builder-test"),
            setRepository = $(linkText(REPOSITORY)),
            issuesTab = $("#issues-tab"),
            issueSearchInput = $("#js-issues-search"),
            checkIssueNum = $(withText(ISSUE));

    public GitHubPages openPage() {
        open("/");
        return this;
    }

    public GitHubPages searchForRepository() {
        searchInput.click();
        searchQuery.setValue(REPOSITORY).submit();
        return this;
    }

    public GitHubPages openRepository() {
        setRepository.click();
        return this;
    }
    public GitHubPages openIssuesTab() {
        issuesTab.click();
        return this;
    }

    public GitHubPages searchForIssue() {
        issueSearchInput.clear();
        issueSearchInput.setValue(ISSUE).submit();
        return this;
    }

    public GitHubPages checkIssueNumber() {
        checkIssueNum.should(Condition.exist);
        return this;
    }
}
