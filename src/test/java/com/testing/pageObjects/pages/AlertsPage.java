package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/alerts")
public class AlertsPage extends AlertsFrameAndWindowsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By ALERTS_TITLE= text("Alerts");
  // Page contains multiple buttons with the same name, but different functionality.
  public static By ALERT_BUTTON= css("button[class='btn btn-primary']");
  public static By TIMER_ALERT_BUTTON= id("timerAlertButton");
  public static By CONFIRM_ALERT_BUTTON;
  public static By PROMPT_ALERT_BUTTON= id("promtButton");
  public static By CONFIRM_RESULT= id("confirmButton");
  public static By PROMPT_RESULT= id("promptResult");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(ALERTS_FRAME_AND_WINDOWS).waitUntilPresent();
    logWeAreOnPage();
  } 
}
