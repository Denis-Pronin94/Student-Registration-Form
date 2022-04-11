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
    SelenideElement gender = $(".custom-control-label");
    SelenideElement userNumberInput = $("#userNumber");
    SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    SelenideElement subjectsInputClick = $("#subjectsInput");
    SelenideElement hobbiesWrapper = $("#hobbiesWrapper");
    SelenideElement uploadPicture = $("#uploadPicture");
    SelenideElement currentAddressInput = $("#currentAddress");
    SelenideElement state = $("#state");
    SelenideElement haryana = $(byText("Haryana"));
    SelenideElement city = $("#city");
    SelenideElement karnal = $(byText("Karnal"));
    SelenideElement submit = $("#submit");
    SelenideElement checkNameFormInput = $("#example-modal-sizes-title-lg");
    SelenideElement checkCompletedForm = $(".table-responsive");

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
        gender.click();
        return this;
    }

    public  RegistrationFormPage setUserNumber(String userNumber) {
        userNumberInput.setValue(userNumber);
        return this;
    }

    public  RegistrationFormPage setdateOfBirthInput(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public  RegistrationFormPage setSubjectsInputClick() {
        subjectsInputClick.click();
        return this;
    }

    public  RegistrationFormPage setSubjectsInputClick(String subjects) {
        subjectsInputClick.setValue(subjects).pressEnter();
        return this;
    }

    public  RegistrationFormPage setHobbiesWrapper(String hobbies) {
        hobbiesWrapper.$(byText(hobbies)).click();
        return this;
    }

    public  RegistrationFormPage setUploadPicture(String picture) {
        uploadPicture.uploadFromClasspath(picture);
        return this;
    }

    public  RegistrationFormPage setCurrentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);
        return this;
    }

    public  RegistrationFormPage setState() {
        state.click();
        return this;
    }

    public  RegistrationFormPage setHaryana() {
        haryana.click();
        return this;
    }

    public  RegistrationFormPage setCity() {
        city.click();
        return this;
    }

    public  RegistrationFormPage setKarnal() {
        karnal.click();
        return this;
    }

    public  RegistrationFormPage setSubmit() {
        submit.pressEnter();
        return this;
    }

    public  RegistrationFormPage setcheckNameFormInput(String text) {
        checkNameFormInput.shouldHave(text(text));
        return this;
    }

    public  RegistrationFormPage setCheckCompletedForm(String text) {
        checkCompletedForm.shouldHave(text(text));
        return this;
    }
}
