package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Jih0316_ScannerPractice {

	public static void main(String[] args) {
		System.out.println("회원가입 form");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID를 입력해주세요 : ");
		String userId = scanner.next();
		
		System.out.println("Name을 입력해주세요 : ");
		String userName = scanner.next();
		
		System.out.println("E-mail을 입력해주세요 : ");
		String userMail = scanner.next();
		
		System.out.println("password를 입력해주세요 : ");
		String userPwd = scanner.next();
		
		System.out.println("password를 확인해주세요 : ");
		String userConfirmPwd = scanner.next();
		
		System.out.println("주소를 입력해주세요 : ");
		String userAddr = scanner.next();
		
		System.out.println("전화번호를 입력해주세요 : ");
		String userNum = scanner.next();
		
		System.out.println("좋아하는 메뉴를 입력해주세요 : ");
		String userFavMenu = scanner.next();
		
		System.out.println("ID는 : " + userId);
		System.out.println("Name은 : " + userName);
		System.out.println("E-mail은 : " + userMail);
		System.out.println("Password 는 : " + userPwd);
		System.out.println("Password 확인은 : " + userConfirmPwd);
		System.out.println("주소는 : " + userAddr);
		System.out.println("전화번호는 : " + userNum);
		System.out.println("좋아하는 메뉴는 : " + userFavMenu);
	}

}
