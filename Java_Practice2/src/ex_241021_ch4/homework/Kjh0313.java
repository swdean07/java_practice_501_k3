package ex_241021_ch4.homework;

import java.security.PublicKey;
import java.util.Random;

public class Kjh0313 {
	public static void main(String[] args) {
		String[] food1Materials = { "생크림", "베이컨", "양파" };
		FoodKjh0313 food1 = new FoodKjh0313("크림파스타", 12000, food1Materials);
		String[] food2Materials = { "튀김가루", "계란물", "안심" };
		FoodKjh0313 food2 = new FoodKjh0313("규카츠", 13000, food2Materials);
		String[] food3Materials = { "메로", "레몬" };
		FoodKjh0313 food3 = new FoodKjh0313("메로구이", 9000, food3Materials);

		FoodKjh0313[] foods = { food1, food2, food3 };
		randomRecommendFood(foods);

	}

	public static void randomRecommendFood(FoodKjh0313[] foods) {
		Random random = new Random();
		int randomNumber = random.nextInt(3);
		foods[randomNumber].showInfo();

	}

}