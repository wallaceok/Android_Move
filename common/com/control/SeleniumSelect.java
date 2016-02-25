package com.control;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelect extends Control {

	/**
	 * @author xuwei
	 */

	public SeleniumSelect(WebDriver driver, String id) {
		super(driver, id);
	}

	public SeleniumSelect(WebDriver driver, By by) {
		super(driver, by);
	}

	/**
	 * 根据select的value来选择
	 * 
	 * @param value
	 */
	public void selectOptionByValue(String value) {
		Select sel = new Select(this);
		sel.selectByValue(value);
	}

	/**
	 * 根据显示的文本来选择
	 * 
	 * @param text
	 */
	public void selectOptionByText(String text) {
		Select sel = new Select(this);
		sel.selectByVisibleText(text);
	}

	/**
	 * 根据索引来选择
	 * 
	 * @param index
	 */
	public void selectOptionByIndex(int index) {
		Select sel = new Select(this);
		sel.selectByIndex(index);
	}

	/**
	 * 获取选中的选项(单选列表)
	 * 
	 * @return
	 */
	public WebElement getSelected() {
		Select sel = new Select(this);
		return sel.getFirstSelectedOption();
	}

	/**
	 * 获取所有选中的选项(多选列表)
	 * 
	 * @return
	 */
	public List<WebElement> getAllSelected() {
		Select sel = new Select(this);
		return sel.getAllSelectedOptions();
	}

}
