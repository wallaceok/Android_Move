package com.control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class ErControl extends Control implements LazyLoadControl {

	protected String domId;

	public ErControl(WebDriver driver, By by) {
		super(driver, by);
		er_init();
	}

	public ErControl(WebDriver driver, String id) {
		super(driver, id);
		er_init();
	}

	public ErControl(WebElement webElement) {
		super(webElement);
		er_init();
	}

	/**
	 * ER的基础控件都是有domID的 这里初始化内部的domID，供控件内部初始化使用
	 */
	private void er_init() {
		this.domId = wrappedElement.getAttribute("id");
	}

	public abstract ErControl init();
}
