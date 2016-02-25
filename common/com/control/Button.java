package com.control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Button extends Control{
   public Button(WebDriver driver,By by){
	   super(driver,by);
   }
   public Button(WebDriver driver,String id){
	   super(driver,id);
   }
   public String getText(){
	   //为什么直接调用了getText()方法，而没有用对象或者super？？？？？？
	   return getText();
   }
	
}
