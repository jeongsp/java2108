package com.example.chapter02;

public class Variable7_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constant 상수 선언
		final double PI = 3.14592;
		
		char myChar ='A';
		System.out.println((int)myChar); // 명시적(강제적) 형변환
		int num1=5, num2=3;
		double num3;
		num3 = num1/3.0;
		System.out.println(num3); // 묵시적 형변환 , num1은 실수로 형변환이 되어서 사용

	}

}
