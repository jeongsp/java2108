package com.example.chapter04;

import java.util.Scanner;

public class BasicinOut {

	public static void main(String[] args) {
		// �⺻ ��¹�
		// println() : ���δ����� ���
		// print()
		// printf()
		int a = 10, b = 20;
		System.out.println("Hello");
		System.out.println("Hello" + "java"); // + : concatenate
		System.out.print(a);
		System.out.print(",");
		System.out.print(b);
		System.out.print("\n");
		System.out.print("\t");
		System.out.print("korea\n");
		System.out.printf("%05d, %d, %s\n", a,b,"korea");
		System.out.printf("%x, %o, %s\n", a,b,"korea");
		System.out.printf("%10.3f, %o, %s\n", 123.4,b,"korea");

		// �⺻ �Է�
		Scanner read = new Scanner(System.in);
		System.out.println("�����͸� �Է����ּ���");
		int data = read.nextInt();
		System.out.println(data);
	}

}
