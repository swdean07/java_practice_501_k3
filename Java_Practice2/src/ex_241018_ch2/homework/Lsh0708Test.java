package ex_241018_ch2.homework;

import java.util.Scanner;

public class Lsh0708Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String id = "admin";
		String pass = "1234";

		System.out.println("아이디를 입력하세요 :");
		String userID = scanner.next();
		System.out.println("비밀번호를 입력하세요 :");
		String userPass = scanner.next();

		if (userID.equals(id)) {
			if (userPass.equals(pass)) {
				System.out.println("축하합니다. 로그인 성공!");
			} else {
				System.out.println("비밀번호 틀림! 로그인 실패!!");
			}
		} else {
			System.out.println("아이디 불일치! 로그인 실패!!");

		}
	}

}
