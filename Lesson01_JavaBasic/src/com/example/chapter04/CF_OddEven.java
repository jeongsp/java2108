package com.example.chapter04;

import java.util.Scanner;

public class CF_OddEven {

	public static void main(String[] args) {
		    // if else ����� ����
			// if ���ǽ� {  } else {  }
			// ��ĳ�� ���� �غ�
			Scanner input = new Scanner(System.in);
			// �޽��� ���
			System.out.println("���ڸ� �Է��ϼ���");
			// ���� �Է�
			int number = input.nextInt();
			// Ȧ¦ ���
		    // ������� �������� 0�̸� ¦, �ƴϸ� Ȧ
			if(number %2 ==0) {
				System.out.println("¦���Դϴ�.");
			}else {
				System.out.println("Ȧ���Դϴ�.");
						}
			input.close(); // ��ĳ�� �ڿ� �ݳ�, ���ϸ� �޸𸮿� ��� ���̰� ��
			System.out.println("���α׷� �����մϴ�.");
	} // end of main
} // end of class