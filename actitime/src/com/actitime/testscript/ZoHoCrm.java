package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoHoCrm {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static WebDriver driver;
@Test
public void loginCrm() {
	 driver=new ChromeDriver();
	 driver.get("http://192.168.118.128:8080");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	 driver.findElement(By.id("passWord")).sendKeys("123456");
	 driver.findElement(By.xpath("//input[@type='image']")).click();
	 driver.findElement(By.xpath("//a[text()='Logout [rashmi@dell.com]']")).click();
	 driver.close();
}
}
