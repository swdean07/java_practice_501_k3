package ex_241021_ch3;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		//1
		Scanner scanner = new Scanner(System.in);
		//2
		System.out.println("exit을입력하면종료합니다.");
		//3
		while (true) {
			//3-1
			System.out.print(">>");
			//3-2
			String text = scanner.nextLine();
			//3-3
			System.out.println("입력된 내용 확인 : " + text);
			//3-4
			if (text.equals("exit")) // "exit"이입력되면반복종료
				break; // while 문을벗어남
		}
		//4
		System.out.println("종료합니다...");
		//5
		scanner.close();
	}
}
