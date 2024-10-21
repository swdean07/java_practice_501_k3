package ex_241018_ch2.homework;

import java.util.Scanner;

public class Cyu0923 {

	public static void main(String[] args) {

		String Id = "admin";
		String Password = "1234";

		System.out.println("로그인 해주세요.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디: ");
		String userId = scanner.next();
		System.out.println("비밀번호: ");
		String userPassword = scanner.next();

		if ((Id.equals(Id)) && (userPassword.equals(Password))) {
			System.out.println("계정 접속 완료");
		} else {
			System.out.println("아이디 혹은 비밀번호가 맞지 않습니다 다시한번 확인해주세요");
		}
		scanner.close();
	}

}
