package ex_241021_ch3.homework;

import java.util.Scanner;

public class Jhwon0324_Lunch {
	public static void main(String[] args) {
		String[] a = new String[3];
		
		try (Scanner scanner = new Scanner(System.in)) {
			for (int i = 0; i < a.length; i += 1) {
				String input = "";
				while (input.isBlank()) {
					System.out.printf("먹고싶은 메뉴를 골라보세요 (%d/%d 번째):", i + 1, a.length);
					input = scanner.nextLine();
				}
				a[i] = input;
			}
		}
		
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1) System.out.print(", ");
		}
		System.out.println(" ]");
		
	}
}
