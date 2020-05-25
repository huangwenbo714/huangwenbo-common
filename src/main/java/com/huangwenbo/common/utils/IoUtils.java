package com.huangwenbo.common.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.util.Arrays;

public class IoUtils {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		String str =null;
		while((str=br.readLine())!=null){
			//System.out.println(str);
			String[] split = str.split("\t");
			System.out.println(Arrays.toString(split));
		}
		
		
	}
}
