package com.util;

import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.config.DriverManage;

import io.appium.java_client.android.AndroidDriver;

public class CommonMethord {
	
   /**
    * 向下滑动
    * @param driver
    * @param during
    */
    public void swipeToUp(AndroidDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
        // wait for page loading
    }

    /**
     * 向下滑动
     * @param driver
     * @param during
     */
    public void swipeToDown(AndroidDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
        // wait for page loading
    }

   /**
    * 向左滑动
    * @param driver
    * @param during
    */
    public static void swipeToLeft(AndroidDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
        // wait for page loading
    }

    /**
     * 向右滑动
     * @param driver
     * @param during
     */
    public static void swipeToRight(AndroidDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
        // wait for page loading
    }
    
    /**
	 * 判断是否进入程序主界面
	 * @param driver
	 * @param personReg
	 * @return
	 */
	public boolean IsExists(WebDriver driver,String personReg) {
		// TODO Auto-generated method stub
		boolean isExists=driver.findElement(By.id("bt_login")).getText().equals(personReg);
		return isExists;
	}
	
	/**
	 * 处理编译后的文件路径
	 * 
	 * @param filepath
	 * @return
	 */
	public static String convertFilepath(String filepath) throws Exception {

		if (filepath.contains("bin")) {
			filepath = filepath.replace("bin/", "");
		}
		return filepath;
	}

	/**
	 * 获取绝对路径(工程根目录)
	 * 
	 * @param filepath
	 * @return
	 */
	public static String getRealath() throws Exception {

		String path = "";
		try {
			
			path = DriverManage.class.getClassLoader().getResource("").toURI().getPath();
			
			try {
				path = CommonMethord.convertFilepath(path);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return path;
	}
}
