import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

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
}
