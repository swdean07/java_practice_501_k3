package ex_241021_ch3.homework;
import java.util.Scanner;

public class Cgw0910_arrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String menu[] = new String[3];
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "번째 먹고싶은 메뉴를 입력해주세요");
			menu[i] = scanner.next(); 
		}
		for (int i = 0; i < menu.length; i++) {
			System.out.println( "먹고싶은 메뉴:" + menu[i]);
		} 
		scanner.close();
	}
}
