package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/tabs")
public class TabsPage extends WidgetsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By TABS_TITLE= text("Tabs");
  public static By CONTENT= css("div[class='tab-content']");
  public static By WHAT_TAB= id("demo-tab-what");
  public static By ORIGIN_TAB= id("demo-tab-origin");
  public static By USE_TAB= id("demo-tab-use");
  public static By MORE_TAB= id("demo-tab-more");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(TABS_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
