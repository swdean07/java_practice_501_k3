package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Kdh1018_ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("회원가입");
		
		System.out.println("id : ");
		String userID = scanner.next();
		System.out.println("id는 : " + userID);
		
		System.out.println("password : ");
		String userPassword = scanner.next();
		System.out.println("password는 : " + userPassword);
		
		System.out.println("password확인 : ");
		String userPasswordCheck = scanner.next();
		System.out.println("password확인 : " + userPasswordCheck);
		
		System.out.println("email : ");
		String userEmail = scanner.next();
		System.out.println("Email은 : " + userEmail);
		
		System.out.println("주소 : ");
		String userAdress = scanner.next();
		System.out.println("주소는 : " + userAdress);
		
		System.out.println("전화번호 : ");
		String userMobile = scanner.next();
		System.out.println("전화번호는 : " + userMobile);
		
		System.out.println("좋아하는메뉴 : ");
		String userFood = scanner.next();
		System.out.println("좋아하는메뉴는 : " + userFood);
		

		
		
	}

}
