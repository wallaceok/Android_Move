package com.control;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsDriver;

/*
 * Control是所有控件的基类，实现了WebElement，WrapsDriver，Locatable 3个接口。<br/>
 * 所以需要构造函数的WebElement也必须实现了WrapsDriver和Locatable这两个接口用户获取实现了WrapsDriver和Locatable这两个接口用于获取实例的webdriver和位置信息。
 * 否则抛出IllegalArgumentException异常。
 */

public abstract class Control implements WebElement,WrapsDriver,Locatable{

	protected WebElement wrappedElement = null;
	protected WebDriver driver = null;
	
	/*
	 * Construct Control instance,set wrapped element.
	 */
	//构造方法是为变量赋值用的，创建对象，分配空间
	public Control(WebElement webElement){
		if (null == webElement){
			throw new IllegalArgumentException("Argument webElement cannot be null.");
		}
		
		//或者？？？？？？？？？
		if(!(webElement instanceof WebElement)
				||!(webElement instanceof WrapsDriver)
				||!(webElement instanceof Locatable)){
			throw new IllegalArgumentException("Argument webElement type error.");
		}
		
		wrappedElement = webElement;
		//强制类型转换？？？？？
		driver = ((WrapsDriver)webElement).getWrappedDriver();
	}
	
	/*
	 * Construct object with web element find by ID.
	 */
	public Control(WebDriver driver,String id){
		this(driver.findElement(By.id(id)));
	}
	
	/*
	 * Construct object with web element find by BY object.
	 */
	public Control(WebDriver driver,By by){
		this(driver.findElement(by));
	}
	
	public Coordinates getCoordinates(){
		return ((Locatable) wrappedElement).getCoordinates();
	}
	
//	public Point getLocationOnScreenOnceScrolledIntoView(){
//		return ((Locatable) wrappedElement).getLocationOnScreenOnceScrolledIntoView();
//	}
	public WebDriver getWrappedDriver() {
		return ((WrapsDriver) wrappedElement).getWrappedDriver();
	}

	public WebElement getWappedElement() {
		return wrappedElement;
	}
    public void clear(){
    	wrappedElement.clear();
    }
    public void click(){
    	wrappedElement.click();
    }
	public WebElement findElement(By arg0){
        return wrappedElement.findElement(arg0); 
	}
	public List<WebElement> findElements(By arg0){
        return wrappedElement.findElements(arg0); 
	}
	public String getAttribute(String arg0){
		return wrappedElement.getAttribute(arg0);
	}
	//标签
	public String getTagName() {
		return wrappedElement.getTagName();
	}
  //文本框
	public String getText() {
		return wrappedElement.getText();
	}
//主要针对botton(是否点下去)
	public boolean isEnabled() {
		return wrappedElement.isEnabled();
	}
//下来菜单，radio,checkbox
	public boolean isSelected() {
		return wrappedElement.isSelected();
	}
// 赋值，文本框,多行文本框
	public void sendKeys(CharSequence... arg0) {
		wrappedElement.sendKeys(arg0);
	}
//是否显示
	public boolean isDisplayed() {
		return wrappedElement.isDisplayed();
	}
//点的位置
	public Point getLocation() {
		return wrappedElement.getLocation();
	}
//所有控件的大小
	public Dimension getSize() {
		return wrappedElement.getSize();
	}
//获得css的样式
	public String getCssValue(String propertyName) {
		return wrappedElement.getCssValue(propertyName);
	}
//提交按钮
	public void submit() {
		wrappedElement.submit();
	}
	
	//重写hashCode方法 ，必须重写equals ，为了程序的稳定，多线程的时候可能会有问题
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((driver == null) ? 0 : driver.hashCode());
		result = prime * result
				+ ((wrappedElement == null) ? 0 : wrappedElement.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Control other = (Control) obj;
		if (wrappedElement == null) {
			if (other.wrappedElement != null)
				return false;
		} else if (!wrappedElement.equals(other.wrappedElement))
			return false;
		return true;
	}

}

	

