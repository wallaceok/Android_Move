package mobile.cases;

import mobile.business.PersonRegBussiness;
import mobile.data.PersonRegData;
import org.testng.annotations.Test;

public class PersonReg extends TestBase{

	/**
	 * 注册后，未认证进行点击：付款  收款  扫码  添加银行卡 冻结资金 交易记录 电子对账单是否会弹出去认证的提示
	 */
	PersonRegBussiness personReg=new PersonRegBussiness();
	@Test(dataProvider = "personReg", dataProviderClass = PersonRegData.class, enabled = true)
	public void PersonReg11(String userName,String idCardCode,String phone, String codeSe,
			                String passWord, String industry)
			throws Exception {
		
		try {
			
			personReg.PersonReg(driver, userName, idCardCode, phone, codeSe, passWord , industry);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			//从Mysql数据库的IndexUser表中查询注册的主要数据
			/*	conn = ds.connectDBDriver(dbType, dbUserName, dbPassWord, dbUrl);
				String sql = "select * from IndexUser where Phone=  '" + phone + "'";//根据注册的手机号查询			
				String userId = "userId: "+ ds.getData(conn, sql,1,2);//用户id
				String UserType = "UserType: "+ ds.getData(conn, sql,1,3);//用户类型
				String Authen = "Authenticate: "+ ds.getData(conn, sql,1,4);//是否认证
				String UserStatus = "UserStatus: "+ ds.getData(conn, sql,1,5);//用户状态
				String UserName = "UserName: "+ ds.getData(conn, sql,1,6);//用户名称
				String Phone = "Phone: "+ ds.getData(conn, sql,1,8);//用户手机号
				String IdCardCode = "idCardCode: "+ ds.getData(conn, sql,1,9);//身份证号
				String ProfessionName = "ProfessionName: "+ ds.getData(conn, sql,1,13);//从事行业
				
				String content= "serviceAccount表主要数据:" + "\r\n" +userId + "\r\n" + UserType + "\r\n"
				                + Authen + "\r\n" + UserStatus + "\r\n" + UserName + "\r\n" + Phone + "\r\n" 
						        + IdCardCode + "\r\n" + ProfessionName;
				String filepath="testdata/dianfubao/serviceAccount.txt";//文件路径
				File file=new File(filepath);
				fileOperation.createFile(file);//创建文件
				fileOperation.writeTxtFile(content, file);//查询出来的数据写到文件
				// 判断数据库表中是否存在该用户，且状态为15
				//Assert.assertTrue(data.contains(phone));
				//captureflag = false;*/
		}
	}
}

