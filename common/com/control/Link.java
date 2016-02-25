package com.control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Link extends Control {
	public Link(WebDriver driver, By by) {
		super(driver, by);		
	}

	public Link(WebDriver driver, String id) {
		super(driver, id);		
	}

	public Link(WebElement webElement) {
		super(webElement);
	}

	/**
	 * 获取链接地址
	 * @return
	 */
	public String getHref() {
		return getAttribute("href");
	}
	
	/**
	 * 获取链接的target
	 * @return
	 */
	public String getTarget() {
		return getAttribute("target");
	}
}



