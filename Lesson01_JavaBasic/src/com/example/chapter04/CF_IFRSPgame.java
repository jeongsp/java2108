package com.example.chapter04;

import java.util.Scanner;

public class CF_IFRSPgame {

	public static void main(String[] args) {
		// ���� ���� �� ���� �����
		// ��ǻ�Ͱ� ���� ��, ����ڰ� ���� ���� ����ϱ� ���� ���� ���� ����
		int computerNumber, gamerNumber;
		// ���ڿ� ���ڸ� ����ϴ� ���ڿ� ������ ����
		String winner="", loser="";
		// ��ǻ���� ���� 1~3 ���� �� �ϳ��� ������ ����
		computerNumber = (int)(Math.random()*10) % 3+1;
		// ����ڿ��� ���� �Է��϶�� �޽����� ���
		System.out.println("1:���� 2:���� 3:�� �� �ϳ��� �����ϼ���");
		// ������� ���� �Է¹޴´�.
		Scanner input = new Scanner(System.in);
		gamerNumber = input.nextInt();
		
		//��(��) ���ϱ�
		switch(gamerNumber) {
		case 1 : //����ڰ� ������ ������ ��
			if(computerNumber == 1) {
				winner ="same";
				loser ="same";
			}else if(computerNumber == 2) {
				winner ="computer";
				loser ="gamer";
			}else if(computerNumber == 3 ) {
				winner = "gamer";
				loser = "computer";
			}
			break;
		case 2 : //����ڰ� ������ ������ ��
			if(computerNumber == 1) {
				winner ="gamer";
				loser ="computer";
			}else if(computerNumber == 2) {
				winner ="same";
				loser ="same";
			}else if(computerNumber == 3 ) {
				winner = "computer";
				loser = "gamer";
			}
			break;
		case 3 : //����ڰ� ���� ������ ��
			if(computerNumber == 1) {
				winner ="computer";
				loser ="gamer";
			}else if(computerNumber == 2) {
				winner ="gamer";
				loser ="computer";
			}else if(computerNumber == 3 ) {
				winner = "same";
				loser = "same";
			}
			break;
		default : //����ڰ� �ٸ� ���ڸ� ������ ��
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			break;
		}
		
		System.out.printf("Winner : %s, Loser : %s\n", winner, loser);
		System.out.printf("Gamer : %d, Computer : %d\n", gamerNumber, computerNumber);
		System.out.printf("Winner : %s, Loser : %s\n", winner, loser);
		System.out.printf("Gamer : %d, Computer : %d\n", gamerNumber, computerNumber);
		System.out.println("����־���?? ���α׷��� �����մϴ�...������");

				
		

	}//end of main

}//end of class
