package ex_241021_ch3;

import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor; // 나눗수
		System.out.print("나뉨수를입력하시오:");
		dividend = scanner.nextInt(); // 나뉨수입력
		System.out.print("나눗수를입력하시오:");
		divisor = scanner.nextInt(); // 나눗수입력
		try {
			System.out.println(dividend + "를" + divisor + "로나누면몫은" + dividend / divisor + "입니다.");
		} catch (ArithmeticException e) { // ArithmeticException예외처리코드
			System.out.println("0으로나눌수없습니다!");
		} finally {
			scanner.close(); // 정상적이든예외가발생하든최종적으로scanner를닫는다.
		}
	}
}
