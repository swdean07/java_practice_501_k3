package ex_241018_ch2.homework;

import java.util.Scanner;

public class Hsw861009Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("로그인 구현 해보기");
		
		System.out.println("id: ");
		String userId = scanner.next();
		
		System.out.println("password: ");
		int userPassword = scanner.nextInt();
		
		if (userPassword == 1234)
			System.out.println("로그인 성공입니다.");
		else
			System.out.println("로그인 실패입니다.");
	}

}
