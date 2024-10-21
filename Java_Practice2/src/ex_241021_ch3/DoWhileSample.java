package ex_241021_ch3;

public class DoWhileSample {
	public static void main(String[] args) {
		char a = 'a';
		int result;
		do {
			System.out.print(a);
			result = a + 1;
			System.out.println(" _ a + 1 ->result : "+result);
			a = (char) (a + 1);
		} while (a <= 'z');
	}
}
