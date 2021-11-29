package com.blankfactor.www.blog.automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/blankfactor/www/blog/automation/features/Blog.feature",
        //tags = "@test1",
        glue = "com.blankfactor.www.blog.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class BlogRunner {
}
