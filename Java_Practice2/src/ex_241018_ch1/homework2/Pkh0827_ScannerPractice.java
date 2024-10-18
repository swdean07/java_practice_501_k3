package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Pkh0827_ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("회원 가입 폼 만들기");

		Scanner scanner = new Scanner(System.in);

		System.out.println("ID를 입력하세요");
		String userId = scanner.next();
		System.out.println("name을 작성하세요");
		String userName = scanner.next();
		System.out.println("email을 작성하세요");
		String userEmail = scanner.next();
		System.out.println("password를 입력하세요");
		int userPw = scanner.nextInt();
		System.out.println("password를 다시 입력하세요");
		int userPw2 = scanner.nextInt();
		System.out.println("주소를 입력하세요");
		String userAddress = scanner.next();
		System.out.println("전화번호 입력하세요");
		int userNum = scanner.nextInt();
		System.out.println("좋아하는 메뉴를 입력하세요");
		String userMenu = scanner.next();
		System.out.println("ID : " + userId + " 입니다.");
		System.out.println("name : " + userName + " 입니다.");
		System.out.println("email : " + userEmail + " 입니다.");
		System.out.println("password : " + userPw + " 입니다.");
		System.out.println("password 확인 : " + userPw2 + " 입니다.");
		System.out.println("주소 : " + userAddress + " 입니다.");
		System.out.println("전화번호 : " + userNum + " 입니다.");
		System.out.println("좋아하는 메뉴는 : " + userMenu + " 입니다.");

	}

}
