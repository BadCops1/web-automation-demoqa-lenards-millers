package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/buttons")
public class ButtonsPage extends ElementsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By BUTTONS_TITLE= text("Buttons");
  public static By DOUBLE_CLICK_ME_BUTTON = id("doubleClickBtn");
  public static By RIGHT_CLICK_ME_BUTTON = id("rightClickBtn");
  public static By CLICK_ME_BUTTON = text("Clicl Me");
  // A custom message is thrown each time the user clicks a specific button
  public static By DOUBLE_CLICK_MESSAGE = id("rightClickBtn");
  public static By RIGHT_CLICK_MESSAGE = id("rightClickBtn");
  public static By DYNAMIC_CLICK_MESSAGE = css("p[id='dynamicClickMessage']");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(BUTTONS_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
