package com.neusoft.text1;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��s=a+aa+aaa+aaaa+aaaaa.....��ֵ ������a��һ�����������������nλ��a��ӣ�nҲ�Ǽ�������ģ�
		//�����ӣ�����2��6   ���㣺  s=2+22+222+2222+22222+222222��
		Scanner c = new Scanner(System.in);
		System.out.println("������a��ֵ-----");
		int a = c.nextInt();
 
		long sum = 0;
		System.out.println("������ӵ�����----");
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


