package mobile.data;

import org.testng.annotations.DataProvider;

public class PersonRegData {

	public static String regPhone="13610862055";
	public static String regIdCardNum="410928198806244222";
	
	/**
	 * 注册姓名：张会静
	 * 注册手机号：regPhone
	 * 身份证号码：regIdCardNum
	 * 验证码："000000"
	 * 注册密码：che001
	 * 从事行业：汽配汽修
	 * @return
	 */
	@DataProvider(name = "personReg")
	public static Object[][] PersonReg() {
		
		return new Object[][] { new Object[] {"张会静", regIdCardNum,regPhone,"000000","che001","汽配汽修"}, };
	}
}
