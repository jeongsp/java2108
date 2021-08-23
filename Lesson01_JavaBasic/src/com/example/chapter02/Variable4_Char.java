package com.example.chapter02;

public class Variable4_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A';
		char yourStr = 'V'; // 큰따옴표로 묶인 것은 문자열
		String yourStr2 = "I love you"; 
		System.out.println(myChar);
		System.out.println(yourStr);
		System.out.println(yourStr2);
		
		//char 타입 변수는 ascii로 출력을 할 수 있다.
		System.out.println((int)myChar);
		int newChar = 66;
		// ascii 코드값을 문자로 출력할 수 있다
		System.out.println((char)newChar);
		
		for(int ch = 65; ch < 91;ch++)
			System.out.println((char)ch);
			char ch1 ='한';
			char ch2 = '\uD55C';
		System.out.println(ch1);
	    System.out.println(ch2);
	    
	    
	
	}

}
