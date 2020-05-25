package com.huangwenbo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/***
 * 
 * @author superstar
 * 1.根据日期来算年龄
 * 2.求过去日期离今天还剩的天数
 * 3.求未来日期离今天还剩的天数
 * 4.判断给定的日期是否为今天
 * 5.判断给定的日期是否在本周之内
 * 6.判断给定的日期是否在本月之内
 * 7.给定时间对象，初始化到该月初1月1日0时0分0秒0毫秒
 * 8.给定时间对象，初始化到该月最后一天23时59分59秒59毫秒
 * 9.时间比较
 *
 */
//获取年龄
public class DateUtil {
	
	public static Date StringToDate(String str){
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date date = sdf.parse(str);
			return date;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	//根据日期来算年龄 年龄返回值应该是int类型
	public static int getAge(String birthday){
		//获取当前时间
		Date date = new Date();
		//long time = date.getTime();
		/**
		 * 所述Calendar类是一个抽象类，可以为在某一特定时刻和一组之间的转换的方法calendar
		 *  fields如YEAR ， MONTH ， DAY_OF_MONTH ， HOUR ，等等，以及用于操纵该日历字段，
		 *  如获取的日期下个星期。 时间上的瞬间可以用毫秒值表示，该值是从1970年1月1日00:00 00：00.000 
		 *  GMT（Gregorian）的Epoch的偏移量。 
		 *  
		 *  与其他区域设置敏感的类一样， Calendar提供了一种类方法getInstance ，
		 *  用于获取此类型的一般有用的对象。 Calendar的getInstance方法返回一个Calendar对象，
		 *  其日历字段已使用当前日期和时间进行初始化： 

     		Calendar rightNow = Calendar.getInstance();

		 */
		Calendar instance = Calendar.getInstance();
		instance.setTime(date);
		//获取年份
		int i = instance.get(Calendar.YEAR);
		//生日
		Date date2 = StringToDate(birthday);
		//long time2 = date2.getTime();
		Calendar instance2 = Calendar.getInstance();
		instance2.setTime(date2);
		//获取年份
		int j = instance2.get(Calendar.YEAR);
		return i-j;
	}
	//测试
	public static void main(String[] args) {
		System.out.println(getAge("2001-09-11"));
	}
}
