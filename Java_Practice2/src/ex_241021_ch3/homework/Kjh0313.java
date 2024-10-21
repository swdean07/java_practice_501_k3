package ex_241021_ch3.homework;

import java.util.Scanner;

public class Kjh0313 {
	public static void main(String[] args) {
		String[] menu = new String[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("오늘 먹고 싶은 점심 메뉴 3개 작성해보기 : ");
		for (int i = 0; i < menu.length; i++) {
			System.out.print("메뉴 " + (i + 1) + " : ");
			menu[i] = scanner.nextLine();
		}
		System.out.println("");
		System.out.println("오늘 먹고 싶은 메에뉴 :");
		for (String m : menu) {
			System.out.println(m);
		}
		scanner.close();
	}
}