package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//label[text()=\"Allow all cookies\"]")
    WebElement cookiesButton;

    @CacheLookup
    @FindBy(id = "Capa_1")
    WebElement searchButton;

    @CacheLookup
    @FindBy(className = "eRCKim")
    WebElement gameName;

    public void clickOnCookieButton(){
        clickOnElement(cookiesButton);
    }

    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }

    public void selectGameName(){
        clickOnElement(gameName);
    }
}
