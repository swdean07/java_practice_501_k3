package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Lsh1208_Sign_in {

	public static void main(String[] args) {
		String name;
		int age;
		String id;
		String password;
		String mail;

		Scanner scan = new Scanner(System.in);
		System.out.println("==========회원가입==========");
		System.out.println("이름:");
		name = scan.next();
		System.out.println("나이:");
		age = scan.nextInt();
		System.out.println("아이디:");
		id = scan.next();
		System.out.println("비밀번호:");
		password = scan.next();
		System.out.println("이메일:");
		mail = scan.next();
		System.out.println("=========회원정보==========");
		System.out.println("이름:" + name + "\n나이:" + age + "\n아이디:" + id + "\n비밀번호:" + password + "\n이메일:" + mail);
		System.out.println("=========================");
	}
}
