package mobile.business;

import java.util.concurrent.TimeUnit;
import mobile.page.PersonRegPage;
import io.appium.java_client.android.AndroidDriver;

public class PersonRegBussiness{
	
	PersonRegPage personReg=new PersonRegPage();
	public void PersonReg(AndroidDriver driver,String userName,
			String idCardCode,String phone,String codeSe, 
			String passWord, String industry) throws InterruptedException{
		   
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    if(personReg.IsExists(driver,"登录")){     //判断是否进入登录页
		    	
		    	System.out.println("是否进入程序主界面 "+personReg.IsExists(driver,"登录"));//成功进入程序主界面后打印日志
		    	personReg.hitPersonReg(driver);//点击界面的个人注册按钮		 
		    	personReg.setUserName(driver, userName);//输入真实姓名
		    	personReg.setIdCardCode(driver, idCardCode);//输入身份证号
		    	personReg.setPhone(driver, phone);//输入手机号
		    	personReg.hitGetCode(driver);//点击"获取验证码"按钮
		    	personReg.setPhoneCode(driver, codeSe);
		    	personReg.hitNext(driver);//点击"下一步"按钮
		    	Thread.sleep(1000);
		    	personReg.setPassWord(driver, passWord);//设置登录密码
		    	personReg.hitSubmit(driver);//点击"提交"按钮
		    	personReg.selectIndustry(driver, industry);
		    	
		    }else{
		    	
		    	System.out.println("没有进入程序主界面 "+personReg.IsExists(driver,"登录"));
		    }
		    
	}
}
