package ClassTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtils {
	
	/**
	 * 获取系统时间
	 * @param gs 时间格式   Y 年  M 月  D dayOfYear  h 12 H 24 m 分  S秒
	 * @return 系统时间
	 */
	public static String getDate(String gs){
		String sj = "格式不正确";
		if(gs.startsWith("Y") || gs.startsWith("Y")){
			Date date  = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat(gs);
			sj = sdf.format(date);
		}
		
		return sj;
	}
	
	
	/**获取指定位数的随机数
	 * @param ws 位数多少以内
	 * @return 随机数
	 */
	public static int getData(int ws){
		
		int num = (int)(Math.random() * ws);
		
		return num;
	}
	
	
	
	/**
	 * @param data
	 * @param num
	 * @return
	 */
	public  static int[] addDataToSz(int[] data){
		int index = 0;
		if(data != null){
			data[index++] = getData(100);
		}
		return data;
	}  
	
	
	/**修改文件名  XXXX.XXX
	 * @param oldName
	 * @return
	 */
	public static String updateFileName(String oldName,String gs,int ws){
		String result = "对不起没有名字";
		if(!"".equals(oldName) || !(null == oldName)){
			//得到文件的扩展名
			String kzm = oldName.substring(oldName.lastIndexOf("."));
			
			result = getDate(gs)+getData(ws)+kzm;
		}
		return result;
	}



}
