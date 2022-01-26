package com.internet.tests;

import com.internet.base.BaseTest;
import com.internet.pages.MainPage;
import com.internet.pages.MultipleWindowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.lang.System.*;

public class TestInternet extends BaseTest {

    MainPage mainPage;
    MultipleWindowsPage multipleWindowsPage;



    @Test(priority = 1)
    public void moveToMultipleWindows() {
        mainPage = new MainPage(driver);
        mainPage.goToMultiplePages();
    }

    @Test(priority = 2)
    public void multipleWindowsNavigation() {
        multipleWindowsPage = new MultipleWindowsPage(driver);
        multipleWindowsPage.clickHere();
        Assert.assertEquals(multipleWindowsPage.newWindow(), "New Window", "Error");
        out.println(multipleWindowsPage.newWindow());

        multipleWindowsPage.navigateToMainTab();
        Assert.assertEquals(multipleWindowsPage.mainTab(), "Opening a new window", "Error");
        out.println(multipleWindowsPage.mainTab());


    }


}
