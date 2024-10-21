package ex_241018_ch2.homework;

import java.util.Scanner;

public class Lsh1208_Login {

	public static void main(String[] args) {
		String id = "asd";
		String password = "123";

		Scanner scan = new Scanner(System.in);

		System.out.println("아이디:");
		String userid = scan.next();
		System.out.println("비밀번호");
		String userpassword = scan.next();

		// 문자열 비교는 비교대상1.equals(비교대상2)
		if (id.equals(userid) && password.equals(userpassword)) {
			System.out.println("======================");
			System.out.println("=======로그인 성공=======");
			System.out.println("======================");
		} else {
			System.out.println("======================");
			System.out.println("=======로그인 실패=======");
			System.out.println("======================");
		}
	}

}
