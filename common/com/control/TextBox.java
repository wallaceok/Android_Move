package com.control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TextBox extends Control {

	public TextBox(WebDriver driver, By by) {
		super(driver, by);
		// TODO Auto-generated constructor stub
	}

	public TextBox(WebDriver driver, String id) {
		super(driver, id);
		// TODO Auto-generated constructor stub
	}

	public TextBox(WebElement webElement) {
		super(webElement);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 设置输入框中的文字，会删除原来的文字
	 * @param text
	 */
	public void setText(String text) {
		this.clear();
		this.sendKeys(text);
	}
	
	/**
	 * 在输入框中追加一段文字
	 * @param text
	 */
	public void appendText(String text) {
		this.sendKeys(text);
	}
	
}
