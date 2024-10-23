package ex_241023_ch6;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = "x : " + this.x + ", y : " + this.y;
		return string;
	}

	@Override
	// equals(인자값으로 넘어온 참조형 변수는) 타입이 부모 타입이고, 
	// 실제로 이용할 때는 원래의 자식 타입으로 변경을함. 
	// 다운 캐스팅 -> Point p = (Point) obj;
	public boolean equals(Object obj) {
		Point p = (Point) obj; // obj를 Point 타입으로 다운 캐스팅
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class ObjectPropertyEx {
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(3, 4);
		System.out.println(p.getClass().getName()); // 클래스 이름
		System.out.println(p.hashCode()); // 해시 코드 값
		// toString 재정의, 
		System.out.println(p.toString()); // 객체의 문자열
		// equals 재정의, 
		System.out.println("p.equals(p2) : " + p.equals(p2));
		System.out.println("p.equals(p3) : " + p.equals(p3));

	}
}








