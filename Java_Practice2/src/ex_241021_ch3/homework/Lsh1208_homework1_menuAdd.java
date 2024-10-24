package ex_241021_ch3.homework;

import java.util.Scanner;

public class Lsh1208_homework1_menuAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu[] = new String[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("=====먹고싶은 메뉴 3개=====");
		for (int i = 0; i < 3; i++) {
			System.out.print("메뉴" + (i + 1) + ":");
			menu[i] = scan.next();
		}
		System.out.println("=====먹고싶은 메뉴 출력=====");
		for (int i = 0; i < 3; i++) {
			System.out.println(menu[i]);
		}
	}

}
