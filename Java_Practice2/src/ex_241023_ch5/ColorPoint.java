package ex_241023_ch5;

class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표

	// 생성자 없네요. 기본 생성자가 생략된 상태
	
//	Point(){
	// super();
//}
	
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void showPoint() { // 점의 좌표 출력
		System.out.println("부모 클래스의 메서드 showPoint(): (" + x + "," + y + ")");
	}
}

// Point를 상속받은 ColorPoint 선언 
class ColorPoint extends Point {
	private String color; // 점의 색

	// 기본 생성자를 생략. 
	ColorPoint(){
	 super();
}
	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point의 showPoint() 호출
	}
	
	public void showPoint() { // 점의 좌표 출력
		System.out.println("자식 클래스의 메서드 showPoint(): (" + super.getX() + "," + super.getY() + ")");
	}
}


