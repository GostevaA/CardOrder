package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CardTest {


    @Test
    public void shouldValidTest(){
        open("http://localhost:9999");
        SelenideElement form = $("form");
        form.$("[data-test-id='name'] input").setValue("Смирнов Иван");
        form.$("[data-test-id='phone'] input").setValue("+79270000000");
        form.$("[data-test-id='agreement']").click();
        form.$("[type=button]").click();
        $("[data-test-id='order-success']").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
    @Test
    public void shouldValidTestTwo(){
        open("http://localhost:9999");
        SelenideElement form = $("form");
        form.$("[data-test-id='name'] input").setValue("Максим");
        form.$("[data-test-id='phone'] input").setValue("+79270000000");
        form.$("[data-test-id='agreement']").click();
        form.$("[type=button]").click();
        $("[data-test-id='order-success']").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
    @Test
    public void shouldValidTestThree(){
        open("http://localhost:9999");
        SelenideElement form = $("form");
        form.$("[data-test-id='name'] input").setValue("Павлова Анна-Мария");
        form.$("[data-test-id='phone'] input").setValue("+79270000000");
        form.$("[data-test-id='agreement']").click();
        form.$("[type=button]").click();
        $("[data-test-id='order-success']").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }



}