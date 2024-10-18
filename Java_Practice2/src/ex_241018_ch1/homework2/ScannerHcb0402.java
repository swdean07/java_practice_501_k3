package ex_241018_ch1.homework2;

import java.util.Scanner;

public class ScannerHcb0402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========회원가입==========");
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID를 입력해 주세요." );
		String id = scanner.next();
		System.out.println("이름을 입력해 주세요.");
		String name = scanner.next();
		System.out.println("e-mail을 입력해 주세요.");
		String email = scanner.next();
		System.out.println("비밀번호를 입력해 주세요.");
		String password = scanner.next();
		System.out.println("비밀번호를 다시 한번 입력해 주세요.");
		String passwordCheck = scanner.next();
		System.out.println("주소를 입력해 주세요.");
		String address = scanner.next(); 
		System.out.println("전화번호를 입력해 주세요.");
		long phone = scanner.nextLong();
		System.out.println("좋아하는 메뉴를 입력해 주세요.");
		String menu = scanner.next();
		scanner.close();
		System.out.println("========회원가입 성공========");
		System.out.println("당신의 ID는 " + id + "입니다.");
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 e-mail은 " + email + "입니다.");
		System.out.println("당신의 비밀번호는 " + password + "입니다.");
		System.out.println("당신의 주소는 " + address + "입니다.");
		System.out.println("당신의 전화번호는 " + phone + "입니다.");
		System.out.println("당신이 좋아하는 메뉴는 " + menu + "입니다.");
	}

}
