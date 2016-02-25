package com.control;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UI extends Control{
	public UI(WebDriver driver, By by) {
		super(driver, by);
		// TODO Auto-generated constructor stub
		}

		public UI(WebDriver driver, String id) {
		super(driver, id);
		// TODO Auto-generated constructor stub
		}

		public UI(WebElement webElement) {
		super(webElement);
		// TODO Auto-generated constructor stub
		}
		
		/**
		 * 获取下一级li的节点列表
		 * @return 节点的List
		 */
		public List<WebElement> getList() {
		try {
		return this.findElements(By.xpath("./li"));
		} catch (Exception e) {
		return new ArrayList<WebElement>();
		} 
		}

		/**
		 * 获取下一级li的节点列表文字内容
		 * 如果li节点不为文字内容,返回的结果不可预料
		 * @return 节点内容的list
		 */
		public List<String> getListText() {
		ArrayList<String> listText = new ArrayList<String>();
		for (WebElement li : getList()) {
		listText.add(li.getText());
		}
		// 作业 ：转化成一个数组
		return listText; 
		}
		
    /*    public String getLiText(){
        	String litext= null;
        	for (WebElement li : getList()) {
        		litext=li.getText();
        		log.info(litext);
        		}
        	return litext;
        }
        */
        //返回值不一样，参数不一样
		
	   public String[] getLiText(){
		   List<WebElement> webElmentList = this.getList();
		   String str[] = new String[webElmentList.size()];
		   int i;
		   WebElement li;
		   for(i=0;i<webElmentList.size();i++){
			   li = webElmentList.get(i);
			   str[i]=li.getText();
		   }
		   return str;
	   }
}
