package ex_241018_ch1;

public class Test1 {

	public static void main(String[] args) {
		// Hello 클래스 생성, -> sum 함수를 정의 -> static 정의, 
		// 접근시, 사용시, 클래스명.메서드명 으로 이용 가능. 
		int resultInt = Hello.sum(10, 20);
		System.out.println("결과 resultInt " + resultInt);

	}

}
