package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsForSearch {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
        new HomePage().clickOnCookieButton();
    }

    @When("I click on search icon")
    public void iClickOnSearchIcon() {
        new HomePage().clickOnSearchButton();
    }

    @And("I select Gold Rush Express game")
    public void iSelectGoldRushExpressGame() {
        new HomePage().selectGameName();
    }

    @Then("I should navigate to that page")
    public void iShouldNavigateToThatPage() {
    }
}
