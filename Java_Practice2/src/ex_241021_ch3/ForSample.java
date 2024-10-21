package ex_241021_ch3;

public class ForSample {
	// 이클립스에 디버깅 하는 방법, 
	// 검사하는 코드 앞에 숫자에 더블 클릭해서, 중단점을 설정, 시작점, 끝나는 점. 
	// f11 , 디버깅 모드, 현재 가장 오른쪽에 아이콘 현재, 2개모드 1) 자바 2) 깃
	// 모드 추가, 3) 디버그 모드 추가. 최초 실행시 물어봄. 허용여부 모두 수락. 
	// 진행 단계 3가지 있음. 
	// 진행시 , f5 를 클릭, 스텝 인투 : 메서드, 반복문안으로 진행, 메서드는 
	// 아는 메서드이면, 그냥 넘어가도 됩니다. 예) 출력문, step over(f6) 진행하기. 
	public static void main(String[] args) {
		//1
		int i, sum = 0;
		//2
		for (i = 1; i <= 10; i++) { // 1~10까지반복
			//1
			sum += i;
			//2
			System.out.print(i); // 더하는수출력
			//3
			if (i <= 9) // 1~9까지는'+' 출력
				System.out.print("+");
			//4
			else { // i가10인경우
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈결과출력
			} // else
			
		}// for
	} // main 
} //class
