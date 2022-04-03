package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_Registration_Form {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1366x768";
    }

    @Test
    void fillFormTest() {
        String firstName = "Denis";
        String lastName = "Pronin";
        String userEmail = "Denis_Pronin@yandex.ru";
        String userNumber = "8956456565";
        String currentAddress = "House 123";

        open("/automation-practice-form");

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);
        $(".custom-control-label").click();
        $("#userNumber").setValue(userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1994");
        $("[aria-label='Choose Thursday, December 8th, 1994']").click();
        $("#subjectsInput").click();
        $("#subjectsInput").setValue("M").pressEnter();
        $(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("460.jpg");
        $("#currentAddress").setValue(currentAddress);
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").pressEnter();

        // Asserts
        $(".table-responsive").shouldHave(text(firstName + " " + lastName),
                text(userEmail), text("Male"), text(userNumber),
                text("08 December,1994"), text("Maths"), text("Sports"), text("460.jpg"),
                text(currentAddress), text("Haryana Karnal"));
    }
}