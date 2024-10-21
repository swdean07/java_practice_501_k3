package ex_241021_ch3;

public class NestedLoop {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) { // 단에대한반복. 1단에서9단
			//1
			for (int j = 1; j < 10; j++) { // 각단의곱셈
				System.out.print(i + "*" + j + "=" + i * j); // 구구셈출력
				System.out.print('\t'); // 하나씩탭으로띄기
			}// 2차 for
			//2
			System.out.println(); // 한단이끝나면다음줄로커서이동
		} // 1차 for
		// 추가작업 없음. 
	} // main
} // class
