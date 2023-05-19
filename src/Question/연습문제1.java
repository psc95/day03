package Question;

import java.util.Scanner;

public class 연습문제1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int money, choice, change = 0; // 넣은 금액, 메뉴 선택, 잔돈
	        int coca = 800; // 코카콜라
	        int pepsi = 500; // 펩시콜라
	        int zero = 1000; // 제로콜라
	        
	        // 금액 입력
	        System.out.println("금액을 입력하세요.");
	        money = sc.nextInt();
	        
	        // 메뉴 입력
	        System.out.println("메뉴를 고르세요");
	        System.out.print("1.코카콜라(800원) 2.펩시콜라(500원) 3.제로콜라(1000원) : ");
	        choice = sc.nextInt();
	 
	        // 메뉴 선택 후 잔돈 구하기, 돈이 부족한지 확인
	        if (choice==1 && money>coca) {
	            change = money - coca;
	        } else if (choice==2 && money>pepsi) {
	            change = money - pepsi;
	        } else if (choice==3 && money>zero) {
	            change = money - zero;
	        } else {
	            change = money;
	            System.out.println("돈이 부족해요 ㅠㅠ");
	        }
	        
	        System.out.println("잔돈 : " + change + "원");
		
	}

}
