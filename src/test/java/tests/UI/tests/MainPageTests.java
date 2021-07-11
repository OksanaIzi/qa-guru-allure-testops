package tests.UI.tests;

import annotations.AutoMember;
import annotations.Component;
import annotations.JiraIssue;
import annotations.ManualMember;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.UI.steps.MainPageSteps;

public class MainPageTests extends TestBase {

    public final static String BASE_URL = "https://m2.ru";

    MainPageSteps steps = new MainPageSteps();

    @Test
    @JiraIssue("AS-5")
    @AllureId("4125")
    @ManualMember("c05-OIzibekova")
    @AutoMember("OIzibekova")
    @Component("UI")
    @Feature("Главная страница")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка заголовка страницы")
    public void checkSuccessfulOpenPage(){
        steps.openPage(BASE_URL)
                .checkTitle();
    }

    @Test
    @JiraIssue("AS-5")
    @AllureId("4125")
    @ManualMember("c05-OIzibekova")
    @AutoMember("OIzibekova")
    @Component("UI")
    @Feature("Главная страница")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка заголовка страницы второй вариант")
    public void checkSuccessfulOpenPage2(){
        steps.openMainPage(BASE_URL);
        steps.checkText();
    }
}
