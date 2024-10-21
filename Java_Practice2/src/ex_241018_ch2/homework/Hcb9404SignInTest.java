package ex_241018_ch2.homework;

import java.util.Scanner;

public class Hcb9404SignInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String idAdmin = "admin";
		int passAdmin = 1234;
		System.out.println("=====로그인=====");
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID : ");
		String idInput = scanner.next();
		System.out.println("Password : ");
		int passInput = scanner.nextInt();
		scanner.close();

		boolean idCheck = idAdmin.equals(idInput);
		boolean passCheck = passAdmin == passInput;

		if (idCheck && passCheck) {
			System.out.println("==========로그인 성공==========");
			System.out.println("환영합니다. 하청빈님");
		} else if (idCheck) {
			System.out.println("==========로그인 실패==========");
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (passCheck) {
			System.out.println("==========로그인 실패==========");
			System.out.println("존재하지 않는 아이디 입니다.");
		} else {
			System.out.println("==========로그인 실패==========");
			System.out.println("다시 로그인 해주세요.");
		}
	}

}
