package com.huangwenbo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtilss {
	//生日的静态方法
	public static Date isbirthday(String str){
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date date = sdf.parse(str);
			return date;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	public static int isDate(String birthday){
		//获取当前时间
		Date date = new Date();
		//初始化时间
		Calendar instance = Calendar.getInstance();
		instance.setTime(date);
		
		int i = instance.get(Calendar.YEAR);
		//生日
		Date date2 = isbirthday(birthday);
		//初始化时间
		Calendar instance2 = Calendar.getInstance();
		instance2.setTime(date2);
		
		int j = instance2.get(Calendar.YEAR);
		return i-j;
	}
	//测试
	public static void main(String[] args) {
		System.out.println(isDate("2001-09-11"));
	}
}
