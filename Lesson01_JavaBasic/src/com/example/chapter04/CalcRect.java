package com.example.chapter04;

import java.util.Scanner;

public class CalcRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		System.out.println("�簢���� ���α��̸� �Է����ּ���");
		int a = input.nextInt();
		System.out.println("�簢���� ���α��̸� �Է����ּ���");
		int b = input.nextInt();
		int c = a * b;
		
		System.out.printf("���α��� "%d, ���α��� %d �� �簢�� ���̴� %d �Դϴ�.", a, b, c);

	}

}
