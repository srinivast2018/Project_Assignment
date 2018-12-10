package com.ibm.assessment;

import java.util.List;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.chromedriver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.chromedriver", "c://export//chromedriver.exe");
		// System.setProperty("webdriver.gecko.geckodriver","./drivers/geckodriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://datatables.net");

		WebElement entry = driver.findElement(By.name("example_length"));
		Select selectElt = new Select(entry);
		selectElt.selectByVisibleText("50");

		List<WebElement> rowElt = (List<WebElement>) driver.findElement(By.xpath("//table[@name='ëxample']/tr"));
		int rowsize = rowElt.size();

	}
}
