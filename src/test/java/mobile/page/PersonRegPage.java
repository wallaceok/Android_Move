package mobile.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.control.SeleniumSelect;
import com.control.TextBox;

public class PersonRegPage{
	
	/**
	 * 由参数得到 TextBox
	 * 
	 * @param driver
	 * @param by
	 * @return
	 */
	public TextBox getElement(WebDriver driver,By by){
		
		TextBox textbox=new TextBox(driver,by);
		return textbox;
		
	}
	
	/**
	 * 由参数得到SeleniumSelect
	 * @param driver
	 * @param by
	 * @return
	 */
	public SeleniumSelect getSelect(WebDriver driver,By by){
		
		SeleniumSelect select=new SeleniumSelect(driver, by);
		return select;	
	}
	
	/**
	 * 根据界面的登录按钮，判断是否进入程序主界面
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
	 * 主界面的个人注册入口
	 * @param driver
	 */
	public void hitPersonReg(WebDriver driver){
		
		driver.findElement(By.id("iv_person")).click();
	}
	
	/**
	 * 输入姓名
	 * 
	 * @param driver
	 * @param username
	 */
	public void setUserName(WebDriver driver, String userName) {
		this.getElement(driver, By.id("et_name")).setText(userName);
	}
	
	/**
	 * 输入身份证号
	 *
	 * @param driver
	 * @param idCardCode
	 */
	public void setIdCardCode(WebDriver driver, String idCardCode) {
		this.getElement(driver, By.id("et_card")).setText(idCardCode);
	}
	
	/**
	 * 输入手机号
	 * 
	 * @param driver
	 * @param phone
	 */
	public void setPhone(WebDriver driver, String phone) {
		this.getElement(driver, By.id("et_phone")).setText(phone);
	}
	
	/**
	 * 获取手机验证码按钮
	 * @param driver
	 */
	public void hitGetCode(WebDriver driver){
		
		driver.findElement(By.id("tv_gain_code")).click();
	}
	
	/**
	 * 输入手机验证码
	 * @param driver
	 * @param VerifiCode
	 */
	public void setPhoneCode(WebDriver driver,String VerifiCode){
		
		this.getElement(driver, By.id("et_code")).setText(VerifiCode);
	}
	
	/**
	 * 点击下一步按钮
	 * @param driver
	 */
	public void hitNext(WebDriver driver){
		
		driver.findElement(By.id("affirm_payment")).click();
	}
	
	/**
	 * 输入密码
	 * @param driver
	 * @param passWord
	 */
	public void setPassWord(WebDriver driver,String passWord){
		
		this.getElement(driver, By.id("change_new_pass_text")).setText(passWord);
	}
	
	/**
	 * 输入邀请码
	 * @param driver
	 * @param invitationCode
	 */
	public void invitationCode(WebDriver driver,String invitationCode){
		
		this.getElement(driver, By.id("et_invitation_code")).setText(invitationCode);
	}
	
	/**
	 * 点击"提交"按钮
	 * @param driver
	 */
	public void hitSubmit(WebDriver driver){
		
		driver.findElement(By.id("btn_next")).click();
	}
	
	/**
	 * 选择从事行业
	 * @param driver
	 * @param industry
	 */
	public void selectIndustry(WebDriver driver,String industry){
		
		driver.findElement(By.id("tv_industry_content")).sendKeys(industry);
		
	}
	
	/**
	 * 点击完成按钮
	 * @param driver
	 */
	public void hitComplete(WebDriver driver){
		
		driver.findElement(By.id("affirm_payment")).click();
	}
	
	/**
	 * 点击主界面的付款选项
	 * @param driver
	 */
	public void hitPay(WebDriver driver){
		
		driver.findElement(By.id("text_name_one")).click();
	}
	
	/**
	 * 点击弹出认证框上面的取消按钮
	 * @param driver
	 */
	public void hitCancel(WebDriver driver){
		
		driver.findElement(By.id("btn_cancel")).click();
	}
	
}
