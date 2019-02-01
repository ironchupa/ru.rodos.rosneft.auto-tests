import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Base_old{
  ChromeDriver wd;

  @BeforeMethod
  public void setUp(){
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //wd.get("https://yandex.ru");
  }

//  @AfterMethod
//  public void tearDown(){
//    wd.quit();
//  }

/*  @Test
  public void testGetURL(){
    wd.get("https://yandex.ru");
  }*/
//
//  @Test
//  public void inputText(){
//
//    wd.findElement(By.name("text")).sendKeys("Привет!");
//  }

}