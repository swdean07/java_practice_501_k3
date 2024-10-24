package ex_241023_ch7.homework;

import java.util.ArrayList;
import java.util.Scanner;

import util.UtilLsy1205Test;

public class MainLsy1205Test {

	// 함수의 정의 부분, 소괄호 안에 있는 매개변수(받는 변수) 정의.
	public static void contactProgram(Scanner scanner, ArrayList<PersonLsy1205Test> persons) {
		// 반복문으로 콘솔 상에서, 메인 메뉴가 계속 출력 되는 기능, UI
		while (true) {
			System.out.println("===================================================");
			System.out.println("연락처 프로그램 만들기, ArrayList 버전. ");
			System.out.println("1. 입력, 2. 출력 , 3. 검색 , 4. 삭제, 5. 랜덤 , 6. 종료");
			System.out.println("===================================================");

			String check = scanner.next();

			if (check.equals("1")) {
				System.out.println("입력 기능을 구현 할 예정");
				// 이름, 입력 받기.
				System.out.println("이름 입력>>");
				String userName = scanner.next();
				// 연락처 입력 받기.
				System.out.println("연락처 입력: 예시)010-123-4567>>");
				String userPhoneNumber = scanner.next();
				// 등록 날짜 및 시간 자동입력.
				String nowDateTime = UtilLsy1205Test.makeDateTime();
				// ArrayList<PersonLsy1205Test>
				// PersonLsy1205Test 타입의 인스턴스를 만들기.
				// A a = new A(이름,번호,날짜);
				PersonLsy1205Test person = new PersonLsy1205Test(userName, userPhoneNumber, nowDateTime);

				// 임시 저장소, 추가. add 메서드 이용해서, 리스트에 추가하기.
				persons.add(person);

			} else if (check.equals("2")) {
				System.out.println("출력 기능을 구현 할 예정");
				for (PersonLsy1205Test person : persons) {
					String result = "이름 : " + person.getName() + ", 연락처 : " + person.getContact() + ", 등록 날짜 : "
							+ person.getRegDate();
					System.out.println(result);
				}
			} else if (check.equals("3")) {
				System.out.println("검색 기능을 구현 할 예정");
				System.out.println("검색할 이름:>> ");
				String search = scanner.next();

				boolean found = false;
				for (PersonLsy1205Test person : persons) {
					boolean result = person.getName().equals(search);
					if (result) {
						String result2 = "이름 : " + person.getName() + ", 연락처 : " + person.getContact() + ", 등록 날짜 : "
								+ person.getRegDate();
						System.out.println(result2);
						found = true;
					}
				}
				if (!found) {
					System.out.println("사용자가 없습니다. ");
				}

			} else if (check.equals("4")) {
				System.out.println("삭제 기능을 구현 할 예정");
			} else if (check.equals("5")) {
				System.out.println("랜덤 기능을 구현 할 예정");
			} else if (check.equals("6")) {
				System.out.println("프로그램 종료");
				scanner.close();
				break;
			}

		}

	}

	public static void main(String[] args) {
//		String now = UtilLsy1205Test.makeDateTime();
//		System.out.println("현재 날짜 및 시간 확인 : " + now);

		// 저장소 없음. 그래서, 임시로 메모리에 작업,
		// 임시 저장소 사용할 컬렉션, ArrayList 사용하기. 배열의 업그레이드, 가변 길이의 조정.
		// persons - 참조형변수 -> 메모리 주솟값 -> 0x100
		// 0x100 은 메서드 안에 들어가면, 변경된다? 안됨. 그대로 0x100임.
		ArrayList<PersonLsy1205Test> persons = new ArrayList<PersonLsy1205Test>();

		// 키보드 입력값을 변환 해주는 도구.
		Scanner scanner = new Scanner(System.in);
		// UI 그려주는 메서드
		// persons -> 임시 저장소가, 메서드 안에서 공유가 되므로, 프로그램이 실행이 된다면,
		// 계속 해서 , 임시 저장소를 이용가능.
		// 함수 호출. -> 함수 정의로 감.
		contactProgram(scanner, persons);

	} // main

} // class
