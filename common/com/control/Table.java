package com.control;

import java.util.List;
import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table extends Control {

	/**
	 * @author xuwei
	 */

	public Table(WebDriver driver, String id) {
		super(driver, id);
	}

	public Table(WebDriver driver, By by) {
		super(driver, by);
	}

	/**
	 * 从一个table的单元格中得到文本值. 行列从0开始.
	 * 
	 * @param row
	 * @param col
	 * 
	 * @return 从一个table的单元格中得到文本值
	 */
	public String getCellText(int row, int col) {

		// 得到table表中所有行对象，并得到所要查询的行对象。
		List<WebElement> rows = this.findElements(By.tagName("tr"));
		WebElement theRow = rows.get(row);
		// 调用getCell方法得到对应的列对象，然后得到要查询的文本。
		String text = getCell(theRow, col).getText();
		// String text = getCell(theRow, col).getAttribute("id");
		return text;
	}

	/**
	 * 从一个table的单元格中得到文本值(包含在span标签中). 行列从0开始.
	 * 
	 * @param by
	 *            用于得到table对象
	 * @param row
	 * @param col
	 * 
	 * @return 从一个table的单元格中得到文本值(包含在span标签中)
	 */
	public String getCellTextInSpan(int row, int col) {

		// 得到table表中所有行对象，并得到所要查询的行对象。
		List<WebElement> rows = this.findElements(By.tagName("tr"));
		WebElement theRow = rows.get(row);
		// 调用getCell方法得到对应的列对象，然后得到要查询的文本。
		// 从TD中找到span标签，取span中的文本并返回
		WebElement span = getCell(theRow, col).findElement(By.tagName("span"));
		String text = span.getText();
		// String text = span.getAttribute("id");
		return text;
	}

	/**
	 * 计算一个table的行数.
	 * 
	 * @return table的行数, 包含标题
	 */
	public int getRowCount() {
		// 得到table表中所有行对象。
		List<WebElement> rows = this.findElements(By.tagName("tr"));
		// 返回行数
		return rows.size();
	}

	/**
	 * 根据行号和列号获取table中的元素
	 */
	private WebElement getCell(WebElement Row, int col) {
		List<WebElement> cells;
		WebElement target = null;
		// 列里面有"<th>"、"<td>"两种标签，所以分开处理。
		if (Row.findElements(By.tagName("th")).size() > 0) {
			cells = Row.findElements(By.tagName("th"));
			target = cells.get(col);
		}
		if (Row.findElements(By.tagName("td")).size() > 0) {
			cells = Row.findElements(By.tagName("td"));
			target = cells.get(col);
		}
		return target;
	}
}
