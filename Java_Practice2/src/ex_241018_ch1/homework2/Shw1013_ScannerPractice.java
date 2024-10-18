package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Shw1013_ScannerPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID를 입력해주세요 : ");
		String userID = scanner.next();
		System.out.println("이름을 입력해주세요 : ");
		String userName = scanner.next();
		System.out.println("패스워드를 입력해주세요 : ");
		String userPassword = scanner.next();
		System.out.println("패스워드를 다시 입력해주세요 : ");
		String userPasswordconfirm = scanner.next();
		System.out.println("주소를 입력해주세요 : ");
		String useAddress = scanner.next();
		System.out.println("전화번호를 입력해주세요 : ");
		String userPhonenumber = scanner.next();
		System.out.println("좋아하는 메뉴를 입력해주세요 : ");
		String userFavoritemenu = scanner.next();
		
		System.out.println("======= "+userID + "의 회원 정보 =======");
		System.out.println("ID           | " + userID);
		System.out.println("Name         | " + userName);
		System.out.println("Password     | " + userPassword);
		System.out.println("Password 확인 | " + userPasswordconfirm);
		System.out.println("주소          | " + useAddress);
		System.out.println("전화번호       | " + userPhonenumber);
		System.out.println("좋아하는 메뉴   | " + userFavoritemenu);
		System.out.println("=====================================");	

	}

}
