package ex_241018_ch2.homework;

import java.util.Scanner;

public class Cgw0910 {
	public static void main(String[] args) {
		String id = "admin";
		String password = "1234";
		Scanner scanner = new Scanner(System.in);
		System.out.println("=============회원 가입 폼 작성해보기.=============");
		System.out.println("id를 입력해주세요" + '\n' + "id:");
		String inputId = scanner.next();
		System.out.println("password를 입력해주세요" + '\n' + "password:");
		String inputPassword = scanner.next();
		System.out.println("==========================");
		if ((id.equals(inputId)) && (inputPassword.equals(password))) {
			System.out.println("계정 접속 완료");
		} else {
			System.out.println("아이디 혹은 비밀번호가 맞지 않습니다 다시한번 확인해주세요");
		}
		scanner.close();
	}
}
