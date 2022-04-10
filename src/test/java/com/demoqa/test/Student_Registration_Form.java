package com.demoqa.test;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFormPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Student_Registration_Form {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    Faker faker = new Faker();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = "Male",
            currentAddress = faker.address().fullAddress(),
            userNumber = faker.numerify("##########"),
            day = "08",
            month = "December",
            year = "1994",
            subjects = "Maths",
            hobbies = "Sports",
            picture = "460.jpg",
            state = "Haryana",
            city = "Karnal";

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender()
                .setUserNumber(userNumber)
                .setDatepickermonth(day, month, year)
                .setSubjectsInputClick()
                .setSubjectsInputM(subjects)
                .setHobbiesWrapper(hobbies)
                .setUploadPicture(picture)
                .setCurrentAddress(currentAddress)
                .setState()
                .setHaryana()
                .setCity()
                .setKarnal()
                .setSubmit()
                // Asserts
                .setThanksforsubmittingtheform("Thanks for submitting the form")
                .setTableresponsive(firstName + " " + lastName)
                .setTableresponsive(userEmail)
                .setTableresponsive(gender)
                .setTableresponsive(userNumber)
                .setTableresponsive(day + " " + month + "," + year)
                .setTableresponsive(subjects)
                .setTableresponsive(hobbies)
                .setTableresponsive(picture)
                .setTableresponsive(currentAddress)
                .setTableresponsive(state + " " + city);
    }
}
