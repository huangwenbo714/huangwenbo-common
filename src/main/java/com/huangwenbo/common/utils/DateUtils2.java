package com.huangwenbo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils2 {
	
	//使用静态方法封装生日
	public static Date isbirthday(String str){
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date parse = sdf.parse(str);
			return parse;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	public static int isDate(String birthday){
		//获取当前日期
		Date date = new Date();
		long time = date.getTime();
		
		//生日
		Date date2 = isbirthday(birthday);
		long time2 = date2.getTime();
		return (int)((time-time2)/(1000*60*60*24));
	}
	//测试
	public static void main(String[] args) {
		System.out.println(isDate("2020-06-24"));
	}
}
