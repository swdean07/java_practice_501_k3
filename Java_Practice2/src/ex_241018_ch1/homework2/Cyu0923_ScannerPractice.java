package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Cyu0923_ScannerPractice {

	public static void main(String[] args) {
    
	System.out.println("회원가입");
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("아이디를 입력해 주세요: ");
	String userId = scanner.next();
	System.out.println("이름을 입력해 주세요: ");
	String userName = scanner.next();
	System.out.println("비밀번호를 입력해 주세요: ");
	String userPassword = scanner.next();
	System.out.println("입력한 비밀번호를 확인 해주세요: ");
	String userPassword2 = scanner.next();
	System.out.println("주소를 입력해주세요: ");
	String userEmail = scanner.next();
	System.out.println("전화번호를 입력해주세요: ");
	String userNumber = scanner.next();
	System.out.println("좋아하는 메뉴를 입력해주세요: ");
	String userMenu = scanner.next();
	System.out.println("당신의 아이디는" + userId + "입니다.");
	System.out.println("당신의 이름은" + userName + "입니다.");
	System.out.println("당신의 비밀번호는" + userPassword + "입니다.");
	System.out.println("당신의 확인비밀번호는 " + userPassword2 + "입니다.");
	System.out.println("당신의 주소는" + userEmail + "입니다.");
	System.out.println("당신의 전화번호는" + userName + "입니다.");
	System.out.println("당신이 좋아하는 메뉴는" + userMenu + "입니다.");
	

	}

}
