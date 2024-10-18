package ex_241018_ch1.homework2;
import java.util.Scanner;

public class Cgw0910 {
	// main() 메소드에서 실행 시작
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=============회원 가입 폼 작성해보기.=============");
		System.out.println("id를 입력해주세요" + '\n' + "id:");
		String id = scanner.next();
		System.out.println("name를 입력해주세요" + '\n' + "name:");
		String name = scanner.next();
		System.out.println("email를 입력해주세요" + '\n' + "email:");
		String email = scanner.next();
		System.out.println("password를 입력해주세요" + '\n' + "password:");
		String password = scanner.next();
		System.out.println("password를 다시 한번 입력해주세요" + '\n' + "password:");
		String checkPassword = scanner.next();
		System.out.println("==========================");
		System.out.println("User 정보" + '\n' + "id:" + id + '\n' + "name:" + name + '\n' + "email:" + email + '\n' + "password:" + password);
		scanner.close();
	}
}