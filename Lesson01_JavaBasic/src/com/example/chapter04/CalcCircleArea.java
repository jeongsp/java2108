package com.example.chapter04;

import java.util.Scanner;

public class CalcCircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� ����
	    final double PI = 3.141592;
		// Scanner �Էº��� ����
		Scanner input = new Scanner(System.in);
		// ������ �Է��϶�� �޽��� ���
		System.out.println("���� �������� �Է����ּ���");
		// ������ �Է¹ް�
		int a = input.nextInt();
		// ���� ���� ��� : ������ * ������ * PI
		double b = a * a * PI;
		// ���� ���� ������ ���
		System.out.printf("�������� %d �� ���� ���̴� %10.4f�Դϴ�.", a, b);

	}

}