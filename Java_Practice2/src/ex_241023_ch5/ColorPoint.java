package ex_241023_ch5;

abstract class Point2 {
	// 추상 클래스는 반드시 추상 메서드 하나 이상임.
	abstract public void draw();
}
// 추상클래스에서, 반드시 필수 기능인것은
// 재정의 필수이므로, 실수로 재정의 하는 부분을 미연 방지 가능. 
class ColorPoint2 extends Point2 {

	@Override
	public void draw() {
		System.out.println("추상클래스를 상속받아서, 추상메서드를 의무적으로 재정의 해야함. ");
		
		
	}
	
}

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


