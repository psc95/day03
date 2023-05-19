package if_else;

import java.util.Scanner;

public class Question01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	
//	0은 어떤수로 나눠도 0이 되기 때문에 위치에 따라 원하는 값이 안나올수 있음
	System.out.print("수 입력 : ");
	num = input.nextInt();
	if (num == 0) {
		System.out.println("잘못입력");
	}else if(num % 12 == 0){
		System.out.println("3, 4의 배수");
	}else if(num % 3 == 0) {
		System.out.println("3의 배수");
	}else if(num % 4 == 0) {
		System.out.println("4의 배수");
	}else {
		System.out.println("배수가 아님");
	}
}
}
