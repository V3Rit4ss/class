package com.lec.ex01_tryCatch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i , j;
		System.out.print("ù��° ���� ?");
		i = sc.nextInt();
		System.out.print("�ι�° ���� ?");
		j = sc.nextInt();
		System.out.println("i = "+i+", j = "+j );
		System.out.println("i * j = "+ (i*j) );
		try {//���ܹ߻��κп� �����ֱ�
			
		System.out.println("i / j = "+ (i/j) );
		
		}catch(ArithmeticException e) {//ArithmeticException "����" ���⼭ ���������� ��ȸ�ؼ� ������ �����ض�.
			
			//e.printStackTrace(); //���ܻ����� �ڼ��� �������.
			System.out.println(e.getMessage()); //���ܻ����� �޼����� ���.
			
		}
		
		
		System.out.println("i + j = "+ (i+j) );
		System.out.println("i - j = "+ (i-j) );
		System.out.println("DONE");
		sc.close();
		
	}
}