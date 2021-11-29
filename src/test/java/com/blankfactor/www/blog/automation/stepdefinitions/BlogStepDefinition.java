package com.blankfactor.www.blog.automation.stepdefinitions;

import com.blankfactor.www.blog.automation.steps.BlogStep;
import com.blankfactor.www.blog.automation.steps.HomeStep;
import com.blankfactor.www.blog.automation.steps.PostStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BlogStepDefinition {

    @Steps
    HomeStep homeStep;

    @Steps
    BlogStep blogStep;

    @Steps
    PostStep postStep;

    @Given("^I navigate to website \"([^\"]*)\"$")
    public void iNavigateToWebsite(String strUrl) {
        homeStep.navegateToUrl(strUrl);
    }

    @When("^I open blog section$")
    public void iOpenBlogSection() {
        homeStep.clickOnBlogSection();
    }

    @When("^I scroll down to \"([^\"]*)\" and click the post$")
    public void iScrollDownToAndClickThePostBy(String postTitle) {
        blogStep.selectPage();
        blogStep.selectPost(postTitle);
    }

    @Then("^I validate the correct page \"([^\"]*)\" \"([^\"]*)\"$")
    public void iValidateTheCorrectPage(String postTitle, String postUrl) {
        postStep.validatePage(postTitle);
        postStep.validateUrl(postUrl);
    }

    @And("^I subscribe to the newsletter using the subscribe form \"([^\"]*)\"$")
    public void iSubscribeToTheNewsletterUsingTheSubscribeForm(String message) {
        postStep.typeEmail();
        postStep.clickOnSuscribe();
        postStep.validateThank(message);
    }

    @And("^I go back to the blog section and print a list of the all posts titles with related links$")
    public void iGoBackToTheBlogSectionAndPrintAListOfTheAllPostsTitlesWithRelatedLinks() {
        postStep.goBack();
        blogStep.printTitles();
    }

}
