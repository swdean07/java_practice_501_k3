package ex_241018_ch2.homework;

import java.util.Scanner;

public class JHJ_0406_if {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String admin = "admin";
		
		
		System.out.println("아이디를 입력해주세요 : ");
		String id = scanner.next();
		
		System.out.println("패스워드 입력해주세요 : ");
		int pw = scanner.nextInt();
		

		
		if (id .equals(admin)) {
			if (pw == 1234 ) {
				System.out.println("환영합니다 !");
				
			}
		}else {
			System.out.println("다시 로그인 해주세요.");
		}		
		scanner.close();

	}

}
