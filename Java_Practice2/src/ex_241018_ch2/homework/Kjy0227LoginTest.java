package ex_241018_ch2.homework;

import java.util.Scanner;

public class Kjy0227LoginTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("PW : ");
		String pw = sc.next();
		
		// switch
		switch(id) {
			case "admin" : switch(pw) {
				case "1234" :						
					System.out.println("환영합니다, 김진영님");
					break;
				default :
					System.out.println("다시 로그인해주세요.");
			}
			break;
			default :
				System.out.println("다시 로그인해주세요.");
		}
		
		// 다중if
		if("admin".equals(id)) {
			if("1234".equals(pw)) {
				System.out.println("환영합니다, 김진영님");
			} else {
				System.out.println("다시 로그인해주세요.");
			}
		} else {
			System.out.println("다시 로그인해주세요.");
		}
		
		// 삼항연산
		System.out.println(
				("admin".equals(id) && "1234".equals(pw))
				? "환영합니다, 김진영님" : "다시 로그인해주세요."
		);
	}

}
