package mobile.cases;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.util.CommonMethord;

public class TestBase {
	
	 public static AndroidDriver driver;

	 	@BeforeMethod
	    public void beforeMethod() throws Exception {
	        // set up appium
	 		
	        File classpathRoot = new File(System.getProperty("user.dir"));
	        File appDir = new File(classpathRoot, "apps/DFB");   //安装文件位置    
	        File app = new File(appDir, "KPay_42.apk");        
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("unicodeKeyboard", "True");    //使用Unicode输入法，默认false
	        capabilities.setCapability("resetKeyboard", "True"); //重置输入法到原有的状态，配合使用，默认false
	        capabilities.setCapability("platformName", "Android");//手机操作系统
	        capabilities.setCapability("deviceName","Android Emulator");//手机类型或模拟器
	        capabilities.setCapability("platformVersion", "4.4");  //手机操作系统版本
	        capabilities.setCapability("noReset", true);
	        capabilities.setCapability(CapabilityType.PLATFORM, "WINDOWS");
	        capabilities.setCapability("app", app.getAbsolutePath());//apk文件所在路径
	      
	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        //向左滑动引导页
	      /**  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//等待10秒
   			Assert.assertTrue(driver.findElement(By.id("com.autochina.kypay:id/guide1")).isDisplayed());
	        for(int i=0;i<=4;i++){
	   			CommonMethord.swipeToLeft(driver, 800);  //向左滑动界面
	   			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }*/
   			
	    }

}
