package com.testing.pageObjects.pages;

import java.util.Map;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/checkbox")
public class CheckBoxPage extends ElementsPage {
  // Locators ----------------------------------------------------------------------------------------------------------

  // The button that looks like "Pluss sign"
  public static By EXPAND_BUTTON = css("button[title='Expand all']");
  // Self explanatory
  public static By CHECK_BOX_TITLE = text("Check Box");
  // Find selector for each checkbox
  public static By COMMANDS = css("label[for='tree-node-commands']");
  public static By ANGULAR= css("label[for='tree-node-angular']");
  public static By CLASSIFIED= css("label[for='tree-node-classified']");
  public static By EXCEL_FILE= css("label[for='tree-node-excelFile']");
  // After user selects different options, a string is shown to user containing ALL the selected options.
  public static By RESULT= css("div[id='result']");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(CHECK_BOX_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }

  public Boolean validateSelectedResults(DataTable data){
    for (Map<String, String> map : dataToMap(data)) {
      info("Validating item: " + map.get("Item"));
      if(!getElement(RESULT).getText().contains(map.get("Item"))) return false;
    }
    return true;
  }
}
