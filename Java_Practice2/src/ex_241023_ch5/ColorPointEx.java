package ex_241023_ch5;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point(); // Point 객체 생성
		p.set(1, 2); // Point 클래스의 set() 호출
//		p.showPoint();
		

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); // Point 클래스의 set() 호출
		cp.setColor("red"); // ColorPoint의 setColor() 호출
//		cp.showColorPoint(); // 컬러와 좌표 출력
		
		// 업캐스팅, 부모타입  참조형변수 = 자식 타입. 
		// point 참조형 변수의 타입은 부모 타입. 
		Point point = cp;
		// point 의 메서드 기능을 이용할려고 봤더니, 본인: 자식클래스의 기능을 사용못함. 
		
		
		// 캐스팅 연산자 기호, 소괄호 ()
		// 다운 캐스팅.  -> 자식타입  참조형변수  = (자식타입)부모타입
		ColorPoint newCp = (ColorPoint) point;
//		newCp.
		
		// 업 캐스팅, 다운 캐스팅 왜하나요? 언제 쓰나요? 꼭 사용해야하나요.
		// 업 캐스팅, 다형성을 이용할수 있음. 
		// 배열, 컬렉션을 사용하건, 뭔가 담아야함. 
		// 특정 모델 클래스를 담음. 예) 게시판, 하나의 게시글의 모델 클래스 만듦. 
		// id,name, writer, regDate, modDate, hit
		// 다른 종류의 타입을 담을수 있다. 특히, 상속 관계에 있는 클래스들을 .
		// 다운 캐스팅을 안하면, 원래 클래스의 기능을 사용을 못함. 
		// 제너릭을 사용하기 전까지, 배열, 컬렉션이건, 어떤 모델클래스 확정 하기 전에 사용. 
		// List<Point>
		// 인터페이스, 부모 개념, 자식 개념, 재사용. 
		// 재사용 목적으로 사용을 함. 
		
		// 부모형. 
		Point p1 = new ColorPoint();
		p1.showPoint();
		
		

	}

}





