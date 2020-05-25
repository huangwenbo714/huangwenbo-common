package com.huangwenbo.common.utils;

public class String02Utils {
	//判断是否是空值
	public static boolean isNull(String str){
		
		return str==null || str.trim().length()<1;
	}
	//判断是否是正确的手机号
	public static boolean isPhone(String str){
		//使用正则表达式
		String reg ="^1[2|3|4|5|6|7|8|9]\\d{9}$";
		
		return str.matches(reg);
	}
	//判断是否是正确的邮箱
	public static boolean isEmali(String str){
		//使用正则表达式
		String reg = "^\\w+@\\w+(.com|.con|com.cn)$";
		return str.matches(reg);
	}
	//判断是否全是字母
	public static boolean isString(String str){
		String teg = "^[a-zA-Z]+$";
		
		return str.matches(teg);
	}
	//测试
	public static void main(String[] args) {
		//String str =null;
		System.err.println(isString("asdasdas1"));
	}
}
