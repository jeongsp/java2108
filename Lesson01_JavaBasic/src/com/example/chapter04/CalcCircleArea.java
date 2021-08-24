package com.example.chapter04;

import java.util.Scanner;

public class CalcCircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상수 선언
	    final double PI = 3.141592;
		// Scanner 입력변수 선언
		Scanner input = new Scanner(System.in);
		// 반지름 입력하라는 메시지 출력
		System.out.println("원의 반지름을 입력해주세요");
		// 반지름 입력받고
		int a = input.nextInt();
		// 원의 면적 계산 : 반지름 * 반지름 * PI
		double b = a * a * PI;
		// 계산된 원의 면적을 출력
		System.out.printf("반지름이 %d 인 원의 넓이는 %10.4f입니다.", a, b);

	}

}