package com.example.chapter04;

import java.util.Scanner;

public class CF_Scoring {

	public static void main(String[] args) {
	    // 성적을 입력받아
		// 90이상이면 A등급
		// 80이상이면 B등급
		// 70이상이면 C등급
		// 60이상이면 D등급
		// 그 미만이면 F등급
		/*
		 * if(조건) { }
		 * else if(조건2) { }
		 * else if(조건3) { }
		 * else if(조건n)  {}
		 * else { }
		 */
		// 스캐너 변수 준비
		Scanner input = new Scanner(System.in);
		// 메시지 출력
		System.out.println("점수를 입력하세요");
		// 숫자 입력
		int score = input.nextInt();
		if(score >= 90) {
			System.out.println("A등급입니다.");
		}else if(score >= 80) {
			System.out.println("B등급입니다.");
		}else if(score >= 70) {
				System.out.println("C등급입니다.");
		}else if(score >= 60) {
				System.out.println("D등급입니다.");
		}else {System.out.println("F등급입니다.");
					}
		input.close(); // 스캐너 자원 반납, 안하면 메모리에 계속 쌓이게 됨
		System.out.println("프로그램 종료합니다.");
} // end of main
} // end of class
