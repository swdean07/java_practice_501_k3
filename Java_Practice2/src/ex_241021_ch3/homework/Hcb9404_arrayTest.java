package ex_241021_ch3.homework;

import java.util.Scanner;

public class Hcb9404_arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String [] menuArray = new String[3];
		System.out.println("==========오늘 먹고 싶은 점심 메뉴 3개 작성해보기==========");
		for (int i = 0; i < 3; i++) {
			System.out.println("메뉴"+(i+1)+" : ");
			menuArray[i] = scanner.next();
		}
		System.out.println("===============오늘 먹고 싶은 점심 메뉴는===============");
		for (int i = 0; i < menuArray.length; i++) {
			System.out.println("메뉴"+(i+1)+" : " + menuArray[i]);
		}
		scanner.close();
	}

}