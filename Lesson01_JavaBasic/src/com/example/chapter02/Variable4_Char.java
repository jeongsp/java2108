package com.example.chapter02;

public class Variable4_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A';
		char yourStr = 'V'; // ū����ǥ�� ���� ���� ���ڿ�
		String yourStr2 = "I love you"; 
		System.out.println(myChar);
		System.out.println(yourStr);
		System.out.println(yourStr2);
		
		//char Ÿ�� ������ ascii�� ����� �� �� �ִ�.
		System.out.println((int)myChar);
		int newChar = 66;
		// ascii �ڵ尪�� ���ڷ� ����� �� �ִ�
		System.out.println((char)newChar);
		
		for(int ch = 65; ch < 91;ch++)
			System.out.println((char)ch);
			char ch1 ='��';
			char ch2 = '\uD55C';
		System.out.println(ch1);
	    System.out.println(ch2);
	    
	    
	
	}

}
