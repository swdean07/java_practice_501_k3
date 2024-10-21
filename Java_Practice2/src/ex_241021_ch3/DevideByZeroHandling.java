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
			// 실험장, 
			// 실제로 나중에, 많이 접하게 되는 예외 예제
			// 1. 파일 데이터를 읽을 경우, 예) 이미지를 읽거나,  
			// 2. 데이터를 전달하는 경우, 예) 서버로 , 데이터를 전달하거나, 
			// 3. 널 포인터 예외 , 예) 참조형 변수에 초기화가 안될 경우, 
			// 4. 기타 많이 있음. 
			System.out.println(dividend + "를" + divisor + "로나누면몫은" + dividend / divisor + "입니다.");
			System.out.println("정상일 경우 , 출력이 되고, 예외가 발생시 출력이 안됨. ");
		} catch (ArithmeticException e) { // ArithmeticException예외처리코드
			System.out.println("0으로나눌수없습니다!");
		} finally {
			System.out.println("예외 발생 무관하게 반드시 실행이됨. ");
			System.out.println("사용후 반납할 객체를 반납을 할 때 사용하는 구간. ");
			scanner.close(); // 정상적이든예외가발생하든최종적으로scanner를닫는다.
		}
	}
}
