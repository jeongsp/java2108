package com.example.chapter04;

import java.util.Scanner;

public class CF_GawiBiBo {

	public static void main(String[] args) {
		// 컴퓨터가 내는 수, 사용자가 내는 수를 기억하기 위한 변수를 각각 선언한다.
		int human = 0
		int computer = 0
		int 가위 = 1
		int 바위 = 2
		int 보 = 3
		// 컴퓨터의 수를  1~3 숫자를 임의로 결정한다.
		int computer =(int)(Math.random()*10) % 3+1;
		System.out.println("가위, 바위, 보를 입력하세요");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		// 나이계산
		int age = 2021 - birthYear;
		// 계산된 나이가 20보다 작으면 {미성년 처리}
		if(age < 20) {
			System.out.println("미성년이네요");
			System.out.println("안녕히 가세요...");
		}else {
			System.out.println("어서오세요");
			System.out.println("주문해주세요");
		}
		// 그렇지 않으면 {성년 처리}
		System.out.println("프로그램 종료....");
		

	}

}
