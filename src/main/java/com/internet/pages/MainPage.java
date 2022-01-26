package com.internet.pages;

import com.internet.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends BaseTest {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(linkText = "Multiple Windows")
    WebElement multipleWindowsLink;


    public void goToMultiplePages() {
        multipleWindowsLink.click();
    }
}
