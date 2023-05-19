package if_else;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	String s1, s2;
	Scanner input = new Scanner(System.in);
	
	System.out.println("첫 문자열 입력");
	s1 = input.next();
	System.out.println("두 문자열 입력");
	s2 = input.next();
	
	System.out.println( s2.equals(s1));
	if(s1 .equals(s2) ) {	// s1.equals(s2) == true 문자열은 ==로 같다를 비교할수 없고 a.equals(b)를 써야함
		System.out.println("s1과 s2는 같다");
	}else { //s1.equals(s2) == false
		System.out.println("s1과 s2는 다르다");
	}
	System.out.println("다음 문장들 실행!!!!");
}
}
