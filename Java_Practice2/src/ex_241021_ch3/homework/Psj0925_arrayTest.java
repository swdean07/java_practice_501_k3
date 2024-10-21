package ex_241021_ch3.homework;

import java.util.Scanner;

public class Psj0925_arrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("============오늘 먹고 싶은 점심 메뉴 3개 작성해보기=============");
		String menuArray[] = new String[3];

		for (int i = 0; i < menuArray.length; i++)
			menuArray[i] = scanner.next(); // 키보드에서입력받은정수저장

		System.out.println("============오늘 먹고 싶은 메뉴 출력=============");
		for (int i = 0; i < menuArray.length; i++)
			System.out.print(menuArray[i]);
		
		scanner.close();
	}
}
