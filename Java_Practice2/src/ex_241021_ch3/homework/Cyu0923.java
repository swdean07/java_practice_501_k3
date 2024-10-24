package ex_241021_ch3.homework;

import java.util.Scanner;

public class Cyu0923 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strArray = new String[3];
		System.out.println("먹고싶은 점심메뉴 입력");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(i + 1 + "번째 먹고싶은 메뉴를 입력해주세요");
			strArray[i] = scanner.next();
		}
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("먹고싶은 메뉴:" + strArray[i]);
		}
		scanner.close();

	}

}
