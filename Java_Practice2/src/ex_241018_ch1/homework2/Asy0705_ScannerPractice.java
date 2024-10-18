package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Asy0705_ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------회원가입 폼 작성해보기-------");
		System.out.println("아이디 : ");
		String userId = scanner.next();
		System.out.println("아이디 : " + userId);
		System.out.println("이름 : ");
		String userName = scanner.next();
		System.out.println("이름 : " + userName);
		System.out.println("이메일 : ");
		String userEmail = scanner.next();
		System.out.println("이메일 : " + userEmail);
		System.out.println("비밀번호 : ");
		String userPassword = scanner.next();
		System.out.println("비밀번호 : " + userPassword);
		System.out.println("비밀번호 확인 : ");
		String userPasswordcheck = scanner.next();
		System.out.println("비밀번호 확인 : " + userPasswordcheck);
		System.out.println("주소 : ");
		String userAdress = scanner.next();
		System.out.println("주소 : " + userAdress);
		System.out.println("전화번호 : ");
		String userNumber = scanner.next();
		System.out.println("전화번호 : " + userNumber);
		System.out.println("좋아하는 메뉴 : ");
		String userMenu = scanner.next();
		System.out.println("좋아하는 메뉴 : " + userMenu);

	}

}
