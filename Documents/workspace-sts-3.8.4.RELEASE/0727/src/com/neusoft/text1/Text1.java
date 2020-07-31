package com.neusoft.text1;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求s=a+aa+aaa+aaaa+aaaaa.....的值 ，其中a是一个键盘输入的数，有n位的a相加，n也是键盘输入的，
		//（例子：输入2，6   计算：  s=2+22+222+2222+22222+222222）
		Scanner c = new Scanner(System.in);
		System.out.println("请输入a的值-----");
		int a = c.nextInt();
 
		long sum = 0;
		System.out.println("输入相加的项数----");
		int f = c.nextInt();
		int i = 0;
		int b = 0;
	
		while (i < f) {
			b += a;
			sum += b;
			a *= 10;
			i++;
			
 
		}
		System.out.println(sum);

		
	}
	}


