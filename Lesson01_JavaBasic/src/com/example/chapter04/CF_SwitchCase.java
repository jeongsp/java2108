package com.example.chapter04;

import java.util.Scanner;

public class CF_SwitchCase {

	public static void main(String[] args) {
				// ������ �Է¹޾�
				// 90�̻��̸� A���
				// 80�̻��̸� B���
				// 70�̻��̸� C���
				// 60�̻��̸� D���
				// �� �̸��̸� F���
				/*
				 * switch(��)
				 * case 90~100 :
				 * 	��� A
				 * case 90~100 : A���
				 * case 90~100 : A���
				 * case 90~100 : A���
				 * default :
				 */
				// ��ĳ�� ���� �غ�
				Scanner input = new Scanner(System.in);
				// �޽��� ���
				System.out.println("������ �Է��ϼ���");
				// ���� �Է�
				int score = input.nextInt();
				
				switch (score/10) { // ������� ������ �� �� �ִ� ��
				case 10 :
				case 9 : 
					System.out.println("��� A!!");
					break;
				case 8 :
					System.out.println("��� B!!");
					break;
				case 7 :
					System.out.println("��� C!!");
					break;
				case 6 :
					System.out.println("��� D!!");
					default :
						System.out.println("��� F!!");
					break;
				} // end of switch
				System.out.println("���α׷� �����մϴ�.");
	}

}
