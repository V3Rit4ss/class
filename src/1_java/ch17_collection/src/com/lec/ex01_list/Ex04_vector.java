package com.lec.ex01_list;

import java.util.Vector;

public class Ex04_vector {
	public static void main(String[] args) {
		Vector<Object> vec = new Vector<Object>();
		AClass objA = new AClass();
		BClass objB = new BClass();
		vec.add(objA); //0�� �ε��� 
		vec.add(objB);//1�� �ε���
		vec.add("C"); //2�� �ε���
		vec.add(10);   // vec.add(new Integer(10));  => ������Ʈ�ȿ� �ڵ������� �� ������ �� ��ü������ ��ȯ�ؼ� ��.
		
		System.out.println(vec);
		for(int i=0; i<vec.size(); i++) {
			System.out.println(vec.get(i)/*.toString()*/); 
		}
		if(vec.isEmpty()) {
			System.out.println("vec�� �����Ͱ� �����ϴ�.");
		}else {
			System.out.println("vec�� �����Ͱ� �����ϴ�.");
		}
	}
}