package ex_241018_ch2.homework;

import java.util.Scanner;

public class Shw1013Test {

	public static void main(String[] args) {
	
		String correctID = "admin";
		String correctPassword = "1234";

		Scanner scanner = new Scanner(System.in);

		System.out.print("ID를 입력해주세요: ");
		String userID = scanner.next();

		System.out.print("패스워드를 입력해주세요: ");
		String userPassword = scanner.next();

		if (userID.equals(correctID) && userPassword.equals(correctPassword)) {
			System.out.println("환영합니다. 서현우님!(if문)");
		} else {
			System.out.println("다시 로그인 해주세요.(if문)");
		}
        switch (userID) {
        case "admin":
            if (userPassword.equals(correctPassword)) {
                System.out.println("환영합니다. 서현우님!(switch문)");
            } else {
                System.out.println("다시 로그인 해주세요.(switch문)");
            }
            break;

        default:
        	System.out.println("다시 로그인 해주세요.(switch문)");
            break;
    }

	}

}
