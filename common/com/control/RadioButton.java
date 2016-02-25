package com.control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class RadioButton extends Control{
		public RadioButton(WebDriver driver, By by) {
			super(driver, by);		
		}

		public RadioButton(WebDriver driver, String id) {
			super(driver, id);		
		}

		public RadioButton(WebElement webElement) {
			super(webElement);
		}
    }
