package com.blankfactor.www.blog.automation.steps;

import com.blankfactor.www.blog.automation.pages.BlogPage;
import com.blankfactor.www.blog.automation.utils.Utils;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlogStep {

    BlogPage blogPage;
    Utils utils;

    @Step
    public void selectPage(){
        utils.scrollDown("4000");
        blogPage.getNumberPage().click();
    }

    @Step
    public void selectPost(String postTitle){
        List<WebElement> titles = blogPage.getTitles().findElements(By.className("post-title"));
        for (WebElement webElement : titles) {
            if(webElement.getText().equals(postTitle)){
                webElement.click();
                break;
            }
        }
    }

    @Step
    public void printTitles(){
        List<WebElement> titles = blogPage.getTitles().findElements(By.className("post-title"));
        for (WebElement webElement : titles) {
            WebElement links = webElement.findElement(By.tagName("a"));
            System.out.println(webElement.getText() + " - " + links.getAttribute("href"));
        }
    }
}
