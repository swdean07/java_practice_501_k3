package ex_241023_ch7.homework2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import util.PersonLsy1205Test;
import util.UtilLsy1205Test;

public class Lsy1205HashMapVersion {
	// 함수의 정의 부분, 소괄호 안에 있는 매개변수(받는 변수) 정의.
	public static void contactProgram(Scanner scanner, HashMap<String,PersonLsy1205Test> persons) {
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
				// 기존의 ArrayList 버전으로 추가
//				persons.add(person);
				persons.put(userName, person);

			} else if (check.equals("2")) {
				System.out.println("출력 기능을 구현 할 예정");
				// hashMap -> iteratorable , 가상 테이블의 0행 부터 각행을 조회해서 구현 
				Set<String> keys = persons.keySet(); // 모든 키를 Set 컬렉션에 받아옴 
				  Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴 
				  while(it.hasNext()) { 
				   String key = it.next(); // 키 
				   PersonLsy1205Test value = persons.get(key); // 값 
				   System.out.println("(이름: " + key + " , 연락처 : "
				   + value.getContact() + ", 등록날짜 : "+ value.getRegDate()+" ) "); 
				  } 
			} else if (check.equals("3")) {
				System.out.println("검색 기능을 구현 할 예정");
				System.out.println("검색할 이름:>> ");
				String search = scanner.next();

				boolean found = false;
//				for (PersonLsy1205Test person : persons) {
//					boolean result = person.getName().equals(search);
//					if (result) {
//						String result2 = "이름 : " + person.getName() + ", 연락처 : " + person.getContact() + ", 등록 날짜 : "
//								+ person.getRegDate();
//						System.out.println(result2);
//						found = true;
//					}
//				}
				if (!found) {
					System.out.println("사용자가 없습니다. ");
				}

			} else if (check.equals("4")) {
				System.out.println("삭제 기능을 구현 할 예정");
				System.out.println("삭제할 이름 작성:>>");
				String userName = scanner.next();
				// found , 있다면 삭제 진행, 없다면, 사용자가 없습니다. 
				boolean found = false;
				PersonLsy1205Test removePerson = null;
				// 임시 저장소에 있는 모든 사용자 검색.
//				for (PersonLsy1205Test person : persons) {
//					boolean result = person.getName().equals(userName);
//					System.out.println("result의 결과 : " + result);
//					if (result) {
//						removePerson = person;
//						found = true;
//						break;
//					}
//				}
				if (found) {
					persons.remove(removePerson);
				} else {
					System.out.println("사용자가 없습니다.");
				}
				
			} else if (check.equals("5")) {
				System.out.println("랜덤 기능을 구현 할 예정");
				// 연락처에 사용자가 있다면, 
				if(!persons.isEmpty()) {
					Random random = new Random();
					// 임시 메모리 공간에 등록된 크기만큼만해서, 3명 
					// 0, 1,2 랜덤한 정수 선택하기. 
					int randomIndexNumber = random.nextInt(persons.size());
					System.out.println("선택된 랜덤 인덱스 숫자 확인: " + randomIndexNumber);
					// 랜덤 인덱스 번호 이용해서, 해당 ArrayList 의 요소에 접근.
					PersonLsy1205Test person = persons.get(randomIndexNumber);
					String result = "랜덤으로 선택된 사용자, 이름 : " + person.getName() + ", 연락처 : " + person.getContact() + ", 등록 날짜 : "
							+ person.getRegDate();
					System.out.println(result);
					
				} else {
					System.out.println("연락처 등록된 사용자가 없습니다.");
				}
				
			} else if (check.equals("6")) {
				System.out.println("프로그램 종료");
				scanner.close();
				break;
			}

		}

	}

	public static void main(String[] args) {
		// 임시 저장소 ArrayList -> HashMap 교체, 
		// 차이점, 
		// ArrayList: 순서(인덱스), 중복 허용. 입력, 이상용(0번 인덱스 저장)
		// 입력, 이상용 (1번 인덱스 저장. )
		// HashMap : 자료 구조 형태, 키 : 값으로 저장하는 구조.
		// 기준 키를 기준으로 함. 중복을 허용을 안함. 
		// 예) , 키 : 이상용, 값 : 123
		// 예2), 키 : 이상용, 값 : 456, 기존 값에 덮어쓰기가 됩니다. 
		
		HashMap<String,PersonLsy1205Test> persons = new HashMap<String,PersonLsy1205Test>();
		Scanner scanner = new Scanner(System.in);
	
		contactProgram(scanner, persons);

	} // main
}







