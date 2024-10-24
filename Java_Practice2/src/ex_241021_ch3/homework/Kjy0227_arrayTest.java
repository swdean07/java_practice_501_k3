package ex_241021_ch3.homework;

import java.util.Scanner;

public class Kjy0227_arrayTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] menuArray = new String[3];
		String result = "";
		
		System.out.println("먹고싶은 메뉴를 입력해주세요.");
		for(int i=0; i<menuArray.length; i++) {
			menuArray[i] = scanner.next();
			result = result + " " + menuArray[i];
		}
		
		System.out.println("먹고싶은 메뉴 :" + result);
		scanner.close();
	}

}
