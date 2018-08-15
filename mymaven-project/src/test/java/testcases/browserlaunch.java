package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class browserlaunch extends SeMethods {

	@Test
	public void login() throws InterruptedException {
		startApp("chrome", "http://toolsqa.com/automation-practice-switch-windows/");

		driver.findElement(By.linkText("New Browser Window")).click();

		

	}

}