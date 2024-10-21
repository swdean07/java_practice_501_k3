package ex_241021_ch3.homework;

import java.util.Scanner;

public class Shw1013_lunchMenu {
	public static void main(String[] args) {
		// Scanner 객체 생성 (콘솔 입력 받기)
		Scanner scanner = new Scanner(System.in);

		// 메뉴 3개를 저장할 배열 정의
		String[] menus = new String[3];

		// 메뉴 입력 안내
		System.out.println("============오늘 먹고 싶은 점심 메뉴 3개 작성해보기=============");

		// 반복문을 이용하여 메뉴 3개 입력 받기
		for (int i = 0; i < menus.length; i++) {
			System.out.print("메뉴" + (i + 1) + " : ");
			menus[i] = scanner.nextLine(); // 사용자가 입력한 메뉴 저장
		}

		// 구분선 출력
		System.out.println("=================================================");
			
		// 입력된 메뉴 출력
		System.out.println("오늘 먹고 싶은 메뉴 출력");
		for (int i = 0; i < menus.length; i++) { // 배열의 모든 요소를 반복문으로 출력
			System.out.println(menus[i]);
		}

		// Scanner 닫기
		scanner.close();
	}
}