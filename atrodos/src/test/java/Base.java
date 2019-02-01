
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base{
    WebDriver wd = new ChromeDriver();

    @BeforeMethod
    public void setUp() {
        wd.manage().window().maximize();
        wd.get("https://172.30.48.85"); //go to page
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }


}
