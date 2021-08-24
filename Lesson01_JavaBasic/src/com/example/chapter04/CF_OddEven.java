package com.example.chapter04;

import java.util.Scanner;

public class CF_OddEven {

	public static void main(String[] args) {
		    // if else 제어구문 설명
			// if 조건식 {  } else {  }
			// 스캐너 변수 준비
			Scanner input = new Scanner(System.in);
			// 메시지 출력
			System.out.println("숫자를 입력하세요");
			// 숫자 입력
			int number = input.nextInt();
			// 홀짝 계산
		    // 결과값의 나머지가 0이면 짝, 아니면 홀
			if(number %2 ==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
						}
			input.close(); // 스캐너 자원 반납, 안하면 메모리에 계속 쌓이게 됨
			System.out.println("프로그램 종료합니다.");
	} // end of main
} // end of class