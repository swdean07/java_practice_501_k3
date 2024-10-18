package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Jhj0406_ScannerPractice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------회원 가입폼 작성해보기--------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("ID를 입력해주세요:");
		String id = scanner.next();

		System.out.println("이름을 입력해주세요:");
		String name = scanner.next();

		System.out.println("Email을 입력해주세요:");
		String email = scanner.next();

		System.out.println("Password를 입력해주세요:");
		String password = scanner.next();

		System.out.println("Password를 한번 더 입력해주세요:");
		String passwordck = scanner.next();

		System.out.println("주소 입력해주세요:");
		String address = scanner.next();

		System.out.println("전화번호를 입력해주세요:");
		String number = scanner.next();

		System.out.println("좋아하는 메뉴를 입력해주세요:");
		String menu = scanner.next();

		System.out.println("ID : " + id);
		System.out.println("name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
		System.out.println("Password 확인 : +passwordck");
		System.out.println("주소 : " + address);
		System.out.println("전화번호 : " + number);
		System.out.println("좋아하는 메뉴는 : " + menu);

	}

}
