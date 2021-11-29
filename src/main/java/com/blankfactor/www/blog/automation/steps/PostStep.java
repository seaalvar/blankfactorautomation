package com.blankfactor.www.blog.automation.steps;

import com.blankfactor.www.blog.automation.pages.PostPage;
import com.blankfactor.www.blog.automation.utils.Utils;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;

public class PostStep {

    PostPage postPage;
    Utils utils;

    @Step
    public void validatePage(String pageTitle){
        assertEquals(pageTitle, postPage.getPostTitle().getText());
    }

    @Step
    public void validateUrl(String pageUrl){
        assertEquals(pageUrl, postPage.getDriver().getCurrentUrl());
    }

    @Step
    public void typeEmail(){
        postPage.getEmail().sendKeys(utils.createEmail());
    }

    @Step
    public void clickOnSuscribe(){
        postPage.getBtnSubscribe().click();
    }

    @Step
    public void validateThank(String message){
        utils.waitForVisibility(postPage.getLblThank());
        assertEquals(message, postPage.getLblThank().getText());
    }

    @Step
    public void goBack( ){
        postPage.getDriver().navigate().back();
        postPage.getDriver().navigate().back();
    }


}
