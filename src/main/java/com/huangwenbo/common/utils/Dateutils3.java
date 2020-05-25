package com.huangwenbo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateutils3 {
	//封装生日工具类
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
	//判断过去到今天有多少天
	public static int isAge(String birthday){
		//获取当前时间
		Date date = new Date();
		//获取毫秒值
		long time = date.getTime();
		
		//生日  使用封装的工具类实现
		Date date2 = isbirthday(birthday);
		//获取毫秒值
		long time2 = date2.getTime();
		return (int)((time-time2)/1000/60/60/24);
	}
	public static int isfuture(String birthday){
		//获取当前时间
		Date date = new Date();
		//获取毫秒值
		long time = date.getTime();
		
		//未来时间
		Date date2 = isbirthday(birthday);
		//获取毫秒值
		long time2 = date2.getTime();
		return (int)((time2-time)/(1000*60*60*24));
	}
	//计算年龄
	public static int isAges(String birthday){
		//获取当前时间
		Date date = new Date();
		Calendar instance = Calendar.getInstance();
		instance.setTime(date);
		
		int i = instance.get(Calendar.YEAR);
		//生日
		Date date2 = isbirthday(birthday);
		Calendar instance2 = Calendar.getInstance();
		instance2.setTime(date2);
		
		int j = instance2.get(Calendar.YEAR);
		return i-j;
	}
	//测试
	public static void main(String[] args) {
		//计算过去到今天一共多少天
		//System.out.println("您已经活了"+isAge("2001-09-11")+"天");
		//计算未来到今天一共多少天
		//System.out.println(isfuture("2020-06-11"));
		//计算生日
		System.out.println(isAges("2001-09-11"));
	}
}
