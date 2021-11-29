package com.blankfactor.www.blog.automation.steps;

import com.blankfactor.www.blog.automation.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class HomeStep {

    HomePage homePage;

    @Step
    public void navegateToUrl(String strUrl){
        homePage.getDriver().navigate().to(strUrl);
    }

    @Step
    public void clickOnBlogSection(){
        Actions action = new Actions(homePage.getDriver());
        action.moveToElement(homePage.getLnkInsights()).build().perform();
        homePage.getLnkBlog().click();
    }

}
