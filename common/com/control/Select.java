package com.control;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select extends Control {

	public Select(WebDriver driver, By by) {
		super(driver, by);
	}

	public Select(WebDriver driver, String id) {
		super(driver, id);

	}

	public Select(WebElement webElement) {
		super(webElement);

	}

	/**
	 * 获取选项列表
	 * 
	 * @return
	 */
	public List<WebElement> getOptions() {
		return this.findElements(By.tagName("option"));
	}

	/**
	 * 根据select的value来选择
	 * 
	 * @param value
	 */
	public void selectOptionByValue(String value) {
		Select sel = new Select(this);
		sel.setOptionByValue(value);
	}
	
	/**
	 * 根据select的value来选择
	 * 
	 * @param value
	 */
	public void setOptionByValue(String value) {
		for (WebElement op : getOptions()) {
			if (op.getAttribute("value").equals(value)) {
				op.click();
				return;
			}
		}
		throw new NoSuchElementException(
				"Cannot locate an element in Select-setOptionByValue ");
	}

	/**
	 * 根据显示的文本来选择--ie6下不稳定
	 * 
	 * @param text
	 */
	public void setOptionByText(String text) {
		for (WebElement op : getOptions()) {
			if (op.getText().equals(text)) {
				op.click();
				return;
			}
		}
		throw new NoSuchElementException(
				"Cannot locate an element in Select-setOptionByText ");
	}

	/*
	 * public void testSelect(String id,String text) {
	 * org.openqa.selenium.support.ui.Select select = new
	 * org.openqa.selenium.support.ui.Select(driver.findElement(By.id(id)));
	 * select.selectByValue(text); }
	 */
}
