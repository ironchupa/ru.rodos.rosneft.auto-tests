import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Stest extends Base_old {

	@Test
	public void inputText() throws InterruptedException, AWTException {
		wd.get("http://172.30.48.85");
		//wd.findElement(By.name("text")).sendKeys("Привет!");
		//Thread.sleep(30);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease((KeyEvent.VK_TAB));
		//robot.keyRelease('R');
/*		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_2);*/
	}

/*
	public void LoginAdm() throws AWTException, InterruptedException {


		Robot robot = new Robot();
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_2);*/


	}

