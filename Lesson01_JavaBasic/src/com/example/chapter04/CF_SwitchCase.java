package com.example.chapter04;

import java.util.Scanner;

public class CF_SwitchCase {

	public static void main(String[] args) {
				// 성적을 입력받아
				// 90이상이면 A등급
				// 80이상이면 B등급
				// 70이상이면 C등급
				// 60이상이면 D등급
				// 그 미만이면 F등급
				/*
				 * switch(식)
				 * case 90~100 :
				 * 	등급 A
				 * case 90~100 : A등급
				 * case 90~100 : A등급
				 * case 90~100 : A등급
				 * default :
				 */
				// 스캐너 변수 준비
				Scanner input = new Scanner(System.in);
				// 메시지 출력
				System.out.println("점수를 입력하세요");
				// 숫자 입력
				int score = input.nextInt();
				
				switch (score/10) { // 상수값을 가지고 올 수 있는 식
				case 10 :
				case 9 : 
					System.out.println("등급 A!!");
					break;
				case 8 :
					System.out.println("등급 B!!");
					break;
				case 7 :
					System.out.println("등급 C!!");
					break;
				case 6 :
					System.out.println("등급 D!!");
					default :
						System.out.println("등급 F!!");
					break;
				} // end of switch
				System.out.println("프로그램 종료합니다.");
	}

}
