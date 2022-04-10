package com.demoqa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

        public void setDate(String day, String month, String year) {
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption(month);
            $(".react-datepicker__year-select").selectOption(year);
            $("[aria-label='Choose Thursday, December 8th, 1994']").click();
        }
}
