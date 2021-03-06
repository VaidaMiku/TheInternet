package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class MultipleWindowsPage {

    WebDriver driver;
    ArrayList<String> newTab;

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Click Here")
    WebElement clickHereLink;

    @FindBy(css = ".example > h3:nth-child(1)")
    WebElement newWindowHeadline;

    @FindBy(xpath = "/html/body/div[2]/div/div/h3")
    WebElement mainTabHeadline;


    public void clickHere() {
        clickHereLink.click();
        newTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
    }

    public String newWindow() {
        return newWindowHeadline.getText();
    }

    public void navigateToMainTab() {
        driver.switchTo().window(newTab.get(0));
    }

    public String mainTab() {
        return mainTabHeadline.getText();
    }




}
