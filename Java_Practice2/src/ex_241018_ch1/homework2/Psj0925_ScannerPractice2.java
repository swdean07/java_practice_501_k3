package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Psj0925_ScannerPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("============= 회원 가입 폼 작성 =============");
		System.out.println("아이디 : ");
		String userId = scanner.next();
		System.out.println("이름 : ");
		String userName = scanner.next();
		System.out.println("이메일 : ");
		String userEmail = scanner.next();
		System.out.println("비밀번호 : ");
		String userPass = scanner.next();
		System.out.println("비밀번호 확인 : ");
		String userPassChk = scanner.next();
		System.out.println("주소 : ");
		String userAddr = scanner.next();
		System.out.println("전화번호 : ");
		String userPhone = scanner.next();
		System.out.println("좋아하는 메뉴 : ");
		String userMenu = scanner.next();
		
		
		System.out.println("아이디 : " + userId + ", 이름 : " + userName + ", 이메일 : " + userEmail + 
				", 주소 : " + userAddr + ", 전화번호 : " + userPhone + ", 좋아하는 메뉴 : " + userMenu);
		

	}

}
