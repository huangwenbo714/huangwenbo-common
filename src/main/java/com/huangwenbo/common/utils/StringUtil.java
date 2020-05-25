package com.huangwenbo.common.utils;

import java.util.Random;

/**
 * 字符串工具类
 * 
 * @author superstar
 *
 *2.判断源字符串是否有值，空引号和空格也算没值 String 源字符串
 *3，判断是否为手机号 String源字符串
 *4.判断是否为电子邮箱 String 源字符串
 *5.判断是否全部为字母   int n (长度)
 *6.获取n为随机英文字符串  int n (长度)
 *7.获取n为随机英文和数字字符串 int n (长度)
 *8.获取n位随机中文字符串 int n (长度)
 */
public class StringUtil {
	
	//一般为静态方法 返回值为Boolean类型返回true或false 然后需要传参数
	/**
	 * @param str
	 * @return
	 */
	//判断源字符串是否有值，空引号和空格也算没值 String 源字符串
	public static boolean isEmpty(String str){
		/*
		 * .判断源字符串是否有值，空引号和空格也算没值 String 源字符串
		 * str 需要判断空的值
		 * return 如果为空返回true 否则返回false
		 * 
		 */
		
		/*
		 * 判断str不为空和str不为空引号和空格  trim方法表示的是消除空格。length<1是
		 * 说为空，因为空引号的长度是0
		 */
		return str==null || str.trim().length()<1;
	}
	//判断是否为手机号 String源字符串
	public static boolean isPhone(String str){
		
		String reg="^1[3|4|5|6|7|8|9]\\d{9}$";
		
		return str.matches(reg);
	}
	//判断是否为电子邮箱 String 源字符串
	public static boolean isEmali(String str){
		/**
		 * 邮箱例如:2771564551@qq.com
		 * 但是也有huangwebo@.com
		 * 所以前面可以是数字也可以是字母
		 */
		String reg = "^\\w+@+\\w+(.com|.con|.com.con)$";
		return str.matches(reg);
	}
	//判断是否全部为字母   int n (长度)
	public static boolean isString(String str){
		
		String reg = "^[a-zA-Z]+$";
		return str.matches(reg);
	}
	
	//测试
	public static void main(String[] args) {
		System.out.println(isString("afaf"));
		
	}
}
