package com.example.chapter04;

import java.util.Scanner;

public class CalcRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		System.out.println("사각형의 가로길이를 입력해주세요");
		int a = input.nextInt();
		System.out.println("사각형의 세로길이를 입력해주세요");
		int b = input.nextInt();
		int c = a * b;
		
		System.out.printf("가로길이 "%d, 세로길이 %d 인 사각형 넓이는 %d 입니다.", a, b, c);

	}

}
