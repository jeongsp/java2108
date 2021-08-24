package com.example.chapter03;

public class Operator2_Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 10;
		int result1 = num1 & num2; // &연산자 : 0
		int result2 = num1 | num2; // |연산자 : 15
		int result3 = num1 ^ num2; // ^연산자 : 15
		int result4 = ~num2; // ~ 반전연산자 : 245
		int result5 = num1 << 2; // << 쉬프트연산자 2자리를 좌측으로 옮겨라 2n승만큼 곱해라
		int result6 = num1 >> 2; // << 쉬프트연산자 2자리를 우측으로 옮겨라 2n승만큼 나눠라

		System.out.println("bitwise");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println("shift");
		System.out.println(result5);
		System.out.println(result6);
		
		int numb = 0b00000100; //2진수
		int numx = 0x11; //16진수
		int numo = 011; //8진수
		System.out.println(numb);
		System.out.println(numx);
	}

}
