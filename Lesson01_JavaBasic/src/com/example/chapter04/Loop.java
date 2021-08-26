package com.example.chapter04;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// Iterative / Loop 반복문
		
		// for 문을 이용한 반복문
//		for(int cnt = 1; cnt <=10; cnt++) {
//			System.out.println("안녕하세요");
			
//		} // cnt=cnt+3 (1,4,7,10 : 4번 반복)
		/*
		 * for(제어변수 초기식;반복종료 조건식; 제어변수 증감식;){
		   반복할 코드블록;
		   }
		 */
		
//		for(int number=1; number <=10; number++) {
//			System.out.println(number);
//		}

		// 1부터 10까지의 합계를 구하세요
//		int sum=0;
//		for(int number=1; number<=10;number++) {
//			sum +=number;
//		}
//		System.out.println("1부터 10까지의 합 : " +sum);

		// while 루프제어		
//    	int sum =0;
//		int number =1;
//		while(number <=10) {
//			sum += number;
//			number++;
//		}
//		System.out.println("1부터 10까지의 합 : " +sum);
//	}

		// while 루프 variation 변형
		// do{ } while( );
	Scanner input = new Scanner(System.in);
	int jobNumber = 999;
	do {
		System.out.println("1.자료삽입");
		System.out.println("2.자료조회");
		System.out.println("3.자료수정");
		System.out.println("4.자료삭제");
		System.out.println("0.프로그램 종료");
		jobNumber = input.nextInt();
		System.out.println("작업번호 : " + jobNumber);
		
	}while(jobNumber !=0);
	
	System.out.println(jobNumber);
	}
}
