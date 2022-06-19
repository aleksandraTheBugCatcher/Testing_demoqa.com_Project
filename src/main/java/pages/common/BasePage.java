package pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class BasePage {

     private WebDriver driver;
     private WebDriverWait driverWait;
     private Actions actions;


     public BasePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
          this.driver = driver;
          this.driverWait = driverWait;
          this.actions=actions;
     }

     public WebDriver getDriver() {
          return driver;
     }

     public WebDriverWait getDriverWait() {
          return driverWait;
     }

     public Actions getActions() {
          return actions;
     }

     public void scrollMethod(){
          JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
          jsExecutor.executeScript("window.scrollBy(0,500)");}

     public void switchToChildWindow(){
          String parent = driver.getWindowHandle();

          Set<String> allWindows = driver.getWindowHandles();

          for(String childWindow: allWindows){
               if(!parent.equalsIgnoreCase(childWindow)){
                    driver.switchTo().window(childWindow);
                    break;
               }
          }
     }

     /*public void switchToParentWindow(){
          String parent = driver.getWindowHandle();

          Set<String> allWindows = driver.getWindowHandles();

          for(String childWindow: allWindows){
               if(parent.equalsIgnoreCase(childWindow)){
                    driver.switchTo().window(childWindow);
                    break;
               }
          }
     }*/

}
