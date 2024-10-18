package ex_241018_ch2.homework;

import java.util.Scanner;

public class Kjh0313 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("id: ");
		String id = scanner.next();
		System.out.print("ps: ");
		String ps = scanner.next();

		if (id.equals("admin")) {
			if (ps.equals("1234")) {
				System.out.println("로그인 완료");
			} else {
				System.out.println("비밀번호가 잘못되었습니다.");
			}
		} else {
			System.out.println("로그인 실패");
		}

		scanner.close();
	}
}