package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {

    private final CalendarComponent calendarComponent = new CalendarComponent();

    // locators
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement userEmailInput = $("#userEmail");
    SelenideElement Gender = $(".custom-control-label");
    SelenideElement userNumberInput = $("#userNumber");
    SelenideElement Datepickermonth = $("#dateOfBirthInput");
    SelenideElement SubjectsInputClick = $("#subjectsInput");
    SelenideElement SubjectsInputM = $("#subjectsInput");
    SelenideElement HobbiesWrapper = $("#hobbiesWrapper");
    SelenideElement UploadPicture = $("#uploadPicture");
    SelenideElement currentAddressInput = $("#currentAddress");
    SelenideElement State = $("#state");
    SelenideElement Haryana = $(byText("Haryana"));
    SelenideElement City = $("#city");
    SelenideElement Karnal = $(byText("Karnal"));
    SelenideElement Submit = $("#submit");
    SelenideElement Thanksforsubmittingtheform = $("#example-modal-sizes-title-lg");
    SelenideElement Tableresponsive = $(".table-responsive");

    // actions
    public RegistrationFormPage openPage() {
       open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }
    public RegistrationFormPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public  RegistrationFormPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public  RegistrationFormPage setUserEmail(String userEmail) {
        userEmailInput.setValue(userEmail);
        return this;
    }

    public  RegistrationFormPage setGender() {
        Gender.click();
        return this;
    }

    public  RegistrationFormPage setUserNumber(String userNumber) {
        userNumberInput.setValue(userNumber);
        return this;
    }

    public  RegistrationFormPage setDatepickermonth(String day, String month, String year) {
        Datepickermonth.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public  RegistrationFormPage setSubjectsInputClick() {
        SubjectsInputClick.click();
        return this;
    }

    public  RegistrationFormPage setSubjectsInputM(String subjects) {
        SubjectsInputM.setValue(subjects).pressEnter();
        return this;
    }

    public  RegistrationFormPage setHobbiesWrapper(String hobbies) {
        HobbiesWrapper.find(byText("Sports")).click();
        return this;
    }

    public  RegistrationFormPage setUploadPicture(String picture) {
        UploadPicture.uploadFromClasspath(picture);
        return this;
    }

    public  RegistrationFormPage setCurrentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);
        return this;
    }

    public  RegistrationFormPage setState() {
        State.click();
        return this;
    }

    public  RegistrationFormPage setHaryana() {
        Haryana.click();
        return this;
    }

    public  RegistrationFormPage setCity() {
        City.click();
        return this;
    }

    public  RegistrationFormPage setKarnal() {
        Karnal.click();
        return this;
    }

    public  RegistrationFormPage setSubmit() {
        Submit.pressEnter();
        return this;
    }

    public  RegistrationFormPage setThanksforsubmittingtheform(String text) {
        Thanksforsubmittingtheform.shouldHave(text(text));
        return this;
    }

    public  RegistrationFormPage setTableresponsive(String text) {
        Tableresponsive.shouldHave(text(text));
        return this;
    }
}
