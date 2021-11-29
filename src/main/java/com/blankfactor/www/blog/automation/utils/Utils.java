package com.blankfactor.www.blog.automation.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Utils extends PageObject {

    public void scrollDown(String tam) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("scroll(0, " + tam + ")");
    }

    public WebElement waitForVisibility(WebElement webElement) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 15);
        return webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public String createEmail() {
        String strUnregisteredEmail = "";
        String[] abecedario = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

        Random r = new Random();
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            int numRandon = r.nextInt(25);
            bld.append(abecedario[numRandon]);
        }
        String strCreateEmail = bld.toString();
        strUnregisteredEmail = strCreateEmail + "@YAHOO.COM";
        return strUnregisteredEmail;
    }
}
