package ex_241023_ch7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		// A   a   = new  A()
		// A<String>   a   = new  A<String>()
		// 순서1
		ArrayList<String> a = new ArrayList<String>();

		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next(); // 키보드로부터 이름 입력
			// 순서2
			// 추가 기능. 
			a.add(s); // ArrayList 컬렉션에 삽입
		}

		// ArrayList에 들어 있는 모든 이름 출력
		for (int i = 0; i < a.size(); i++) {
			// 순서3
			// 가져오기 기능. 
			// ArrayList의 i 번째 문자열 얻어오기
			String name = a.get(i);
			System.out.print(name + " ");
		}

		// 가장 긴 이름 출력
		int longestIndex = 0;
		for (int i = 1; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
		
		// 검색하는 부분. 
		// a, 이상용1,2,3 ~ 이상용44
		// 검색어 : 이상용2
		String search = "이상용2";
		if(a.contains(search)) {
			System.out.println("해당 검색어가 존재합니다. ");
			System.out.println("해당검색어의 index 조회 : " + a.indexOf(search));
			System.err.println("검색 결과 : " + a.get(a.indexOf(search)));
		}
		
		// 제거하는 부분. 
		a.remove(longestIndex);
		
		// 제거 후 이름 출력
		for (int i = 0; i < a.size(); i++) {
			// 순서3
			// 가져오기 기능. 
			// ArrayList의 i 번째 문자열 얻어오기
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
	}
}




