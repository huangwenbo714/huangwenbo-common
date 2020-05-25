package com.huangwenbo.common.utils;

public class StringUtils2 {
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
	//判断是否为空
	public static boolean isNull(String str){
		
		return str==null ||str.trim().length()<1;
	}
	//判断手机号
	public static boolean isPhone(String str){
		//使用正则验证
		String reg = "^1[2|3|4|5|6|7|8|9]\\d{9}$";
		
		return str.matches(reg);
	}
	//判断邮箱
	public static boolean isEmail(String str){
		//使用正则验证
		String reg = "^\\w+@\\w+(.com|.con|.com.con)$";
		
		return str.matches(reg);
		
	}
	//判断是否全是字母
	public static boolean isString(String str){
		//使用正则验证
		String reg = "^[a-zA-Z]+$";
		return str.matches(reg);
	}
	//测试
	public static void main(String[] args) {
		//判断是否为空
		//String str = null;
		//System.out.println(isNull(str));
		//判断手机号
		//System.out.println(isPhone("17611431335"));
		//判断邮箱
		//System.out.println(isEmail("2771564551@qq.com"));
		//判断是否全是字母
		System.out.println(isString("qweaA1"));
	}
}
