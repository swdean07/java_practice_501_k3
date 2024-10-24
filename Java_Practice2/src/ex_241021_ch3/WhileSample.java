package ex_241021_ch3;

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int n = 0;
		double sum = 0;
		System.out.println("정수를입력하고마지막에0을입력하세요.");
		while ((n = scanner.nextInt()) != 0) { // 0이입력되면while 문벗어남
			sum = sum + n;
			count++;
		}
		System.out.print("수의개수는" + count + "개이며");
		System.out.println("평균은" + sum / count + "입니다.");
		scanner.close();
	}
}
