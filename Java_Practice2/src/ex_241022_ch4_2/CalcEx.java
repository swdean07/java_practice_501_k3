package ex_241022_ch4_2;

class Calc {
	// static , 공유자원, 전역으로 사용이된다. 인스턴스 없이 접근 가능함. 
	// 인스턴스 멤버와는 차이가 있음. -> 인스턴스 사용후  접근이 가능. 
	public static int abs(int a) {
		return a > 0 ? a : -a;
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int min(int a, int b) {
		return (a > b) ? b : a;
	}
}

public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}
}







