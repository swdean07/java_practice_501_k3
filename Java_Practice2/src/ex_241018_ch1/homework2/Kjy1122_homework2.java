package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Kjy1122_homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=============회원 가입 폼 작성해보기.=============");
		
		System.out.println("Id를 입력 해주세요: ");
		String userId = scanner.next();
		
		
		System.out.println("이름을 적어주세요 : ");
		String userName = scanner.next();
		
		
		System.out.println("패스워드 입력해주세요 : ");
		String userPw = scanner.next();
		
		
		System.out.println("패스워드 한번더 확인 : ");
		String userPw2 = scanner.next();
		
		
		
		System.out.println("주소를 입력하세요 : ");
		String userAd = scanner.next();
		
		
		System.out.println("좋아하는 메뉴 : ");
		String userMenu = scanner.next();
		
		System.out.println("=========<가입 완료>=========");
		
		System.out.println("Id: " + userId);
		System.out.println("name : " + userName);
		System.out.println("Pw : " + userPw);
		System.out.println("Pw2 : " + userPw2);
		System.out.println("Ad : " + userAd);
		System.out.println("Menu : " + userMenu);
		
		
		
	}

}
