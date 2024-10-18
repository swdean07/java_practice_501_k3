package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Kjy0227_ScannerPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=============회원 가입 폼=============");
		System.out.println("id : ");
		String id = scanner.next();
		System.out.println("name : ");
		String name = scanner.next();
		System.out.println("email : ");
		String email = scanner.next();
		System.out.println("password : ");
		String password = scanner.next();
		System.out.println("password check : ");
		String passChk = scanner.next();
		System.out.println("address : ");
		String address = scanner.next();
		System.out.println("phone number : ");
		String pNum = scanner.next();
		System.out.println("favorite menu : ");
		String favMenu = scanner.next();
		System.out.println("=============회원 가입 폼=============");
		
		System.out.println("ID : " + id);
		System.out.println("NAME : " + name);
		System.out.println("EMAIL : " + email);
		System.out.println("PASSWORD : " + password);
		System.out.println("PASSWORD CHECK : " + passChk);
		System.out.println("ADDRESS : " + address);
		System.out.println("PHONE NUMBER : " + pNum);
		System.out.println("FAVORITE MENU : " + favMenu);
		
		scanner.close();
	}

}
