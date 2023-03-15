package com.Test;

import org.testng.annotations.*;

public class testNG_basics1 {


    //Pre Condition
    @BeforeSuite
    public void setUp() {
        System.out.println("Set Up system properties for Browser");
    }

    @BeforeTest
    public void launchBrowser() {
        System.out.println("launch the browser");
    }

    @BeforeClass
    public void openwebpage() {
        System.out.println("Open a web page");
    }

    @BeforeMethod
    public void login() {
        System.out.println("login to app");
    }

    //Test CasE  NOTE-- before a msg and after a msg will print for each test case (alphabetically)
    @Test
    public void checkPageTitle() {
        System.out.println("CHECK PAGE TITLE ");
    }
    @Test
    public void checkSearchButton() {
        System.out.println("CHECK SEARCH BUTTON ");
    }
    @Test
    public void checkLinks() {
        System.out.println("CHECK LINK OF A PAGE ");
    }

    //Post Condition
    @AfterMethod
    public void logout() {
        System.out.println("logout from the app");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("Close the browser");
    }

    @AfterTest
    public void deleteAllCookies() {
        System.out.println("Delete all browser cookies");
    }

    @AfterSuite
    public void generateReport() {
        System.out.println("Generate Test Report");
    }

}
