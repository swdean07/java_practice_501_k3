package ex_241023_ch7.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lsh0708Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Lsh0708Person> a = new ArrayList<Lsh0708Person>();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("===============================================");
			System.out.println("연락처 프로그램 만들기, ArrayList 버전");
			System.out.println("1.입력, 2.출력, 3.검색, 4.삭제, 5.랜덤, 6.종료");
			System.out.println("===============================================");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.print("이름을 입력하세요 : ");
				String name = scanner.next();
				System.out.print("번호을 입력하세요 : ");
				String number = scanner.next();
				Lsh0708Person person = new Lsh0708Person(name, number);
				a.add(person);
				break;
			case 2:
				for (int i = 0; i < a.size(); i++) {
					((Lsh0708Person) a.get(i)).showInfo();
				}
				break;
			case 3:
				System.out.print("검색어를 입력하세요 :");
				String search = scanner.next();

				if (a.contains(search)) {
					((Lsh0708Person) a.get(a.indexOf(search))).showInfo();
				}
				break;

			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			}
		}
	}
}
