package tests.UI.tests;

import annotations.*;
import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.UI.steps.MainPageSteps;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Layer("web")
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

    @Test
    public void openVsegdaDa(){
        step("Открывам главную страницу магазина Детский мир", () -> {
            open("https://vsegda-da.com/");
        });
        step("Кликаем на Акции", () -> {
            $("a[href=\"https://cabinet.vsegda-da.com\"]").click();
        });
        step("Проверяем наличие текста ", () -> {
            $("h3[data-component=\"Heading\"]").shouldHave(Condition.text("Вход в личный кабинет торговой организации"));
        });
        step("Вводим логин ", () -> {
            $("input[id=\"login\"]").setValue("Тест");
        });
    }
}
