package ex_241018_ch1.homework2;

import java.util.Scanner;


public class Jhwon0324_ScannerPractice {
	
	private static String username;
	private static String userID;
	private static String passwd_raw;
	private static String email;
	private static String location;
	private static String contact;
	private static String[] favorites;
	
	private static Scanner scanner;
	private static String prompt(String msg) {
		System.out.print(msg + ": ");
		return scanner.nextLine();
	}
	
	private static void log() {
		System.out.println("name=\t" + username);
		System.out.println("ID=\t" + userID);
		System.out.println("passwd_raw=\t" + passwd_raw);
		System.out.println("email=\t" + email);
		System.out.println("location=\t" + location);
		System.out.println("Contact=\t" + contact);
		System.out.println("Favorite menus: {" + String.join(", ", favorites) + "}");
	}
	
	public static void main(String[] args) {
		try {
			scanner = new Scanner(System.in);
			username = prompt("이름을 입력하세요.");
			userID = prompt("ID를 입력하세요.");
			passwd_raw = prompt("비밀번호를 입력하세요.");
			String confirm = prompt("비밀번호를 한번 더 입력하세요.");
			if (!confirm.equals(passwd_raw)) {
				System.err.println("비밀번호가 일치하지 않습니다!");
				System.exit(1);
			}
			email = prompt("이메일을 입력하세요.");
			location = prompt("사는 곳은?");
			contact = prompt("연락처를 입력하세요.");
			favorites = prompt("좋아하는 것은?").split("\\s+");
			
			log();
		} finally {
			scanner.close();
		}
	}
}
