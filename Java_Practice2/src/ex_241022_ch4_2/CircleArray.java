package ex_241022_ch4_2;

public class CircleArray {
	public static void main(String[] args) {
		Circle[] c;
		c = new Circle[5];
		int result = System.identityHashCode(c);
		System.out.println("c 배열의 임시 주솟값: " + result);
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println((int) (c[i].getArea()) + " ");
			int result2 = System.identityHashCode(c[i]);
			System.out.println("c 배열의 각원소의 임시 주솟값: " + result2);
		}
	}
}
