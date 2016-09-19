package org.selenide.bing.cucumber;

import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class BingSearchSteps {

    @Given("an open browser with bing.com")
    public void openGoogleSearch() {
        open("https://bing.com/");
    }

}
