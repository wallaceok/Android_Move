package com.control;

//import java.util.List;
//import java.util.NoSuchElementException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckBox extends Control{
	
	public CheckBox(WebDriver driver, By by) {
		super(driver, by);
		// TODO Auto-generated constructor stub
	}
	
	public CheckBox(WebDriver driver, String id) {
		super(driver, id);
		// TODO Auto-generated constructor stub
		
	}
	
	public void CheckAll(String id){
		
		List<WebElement> webCheckBox = driver.findElements(By.name(id));
	    for (WebElement e : webCheckBox) {
	    	
	    		e.click();
	    }
	}
	
	
}
