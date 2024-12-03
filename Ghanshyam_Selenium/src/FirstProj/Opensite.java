package FirstProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Opensite {

 WebDriver driver;
 
 public Opensite()
 {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\rosha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
  
    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

    driver.get("http://facebook.com/");
     
 }

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new Opensite();
 }

}


