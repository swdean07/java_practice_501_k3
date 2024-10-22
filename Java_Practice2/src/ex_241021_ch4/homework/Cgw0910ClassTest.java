package ex_241021_ch4.homework;
import java.util.Random;

public class Cgw0910ClassTest {
	public static void main(String[] args) {
		Random random = new Random();

		Cgw0910Food porkSoup = new Cgw0910Food("돼지국밥", 9000, new String[] { "돼지고기, 공기밥, 사골육수" });
		Cgw0910Food Yukgaejang = new Cgw0910Food("육개장", 7000, new String[] { "소불고기, 공기밥, 달걀, 숙주나물, 고사리" });
		Cgw0910Food seaFoodRamen = new Cgw0910Food("해물라면", 16000, new String[] { "전복, 신라면, 조개관자, 닭새우" });

		Cgw0910Food foodArr[] = { porkSoup, Yukgaejang, seaFoodRamen };
		int randomInt = random.nextInt(foodArr.length);

		foodArr[randomInt].introduce();
	}
}
