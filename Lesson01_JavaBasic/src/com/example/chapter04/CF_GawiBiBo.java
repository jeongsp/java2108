package com.example.chapter04;

import java.util.Scanner;

public class CF_GawiBiBo {

	public static void main(String[] args) {
		// ��ǻ�Ͱ� ���� ��, ����ڰ� ���� ���� ����ϱ� ���� ������ ���� �����Ѵ�.
		int human = 0
		int computer = 0
		int ���� = 1
		int ���� = 2
		int �� = 3
		// ��ǻ���� ����  1~3 ���ڸ� ���Ƿ� �����Ѵ�.
		int computer =(int)(Math.random()*10) % 3+1;
		System.out.println("����, ����, ���� �Է��ϼ���");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		// ���̰��
		int age = 2021 - birthYear;
		// ���� ���̰� 20���� ������ {�̼��� ó��}
		if(age < 20) {
			System.out.println("�̼����̳׿�");
			System.out.println("�ȳ��� ������...");
		}else {
			System.out.println("�������");
			System.out.println("�ֹ����ּ���");
		}
		// �׷��� ������ {���� ó��}
		System.out.println("���α׷� ����....");
		

	}

}
