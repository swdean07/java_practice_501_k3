package ex_241021_ch4.homework;

import java.util.Random;

public class Jhwon0324_FoodStore {
	public static void main(String[] args) {
		Jhwon0324_Food foods[] = {
			new Jhwon0324_Food("돼지국밥", 9000, new String[] { "수육", "순대", "국", "다대기" }),
			new Jhwon0324_Food("돈코츠라멘", 10000, new String[] { "면", "분말", "계란", "고명", "차슈" }),
			new Jhwon0324_Food("모짜렐라인더버거베이컨", 11000, new String[] { "빵", "패티", "모짜렐라", "튀김", "베이컨", "양상추인 척하는 양배추" })
		};
		
		Random rng = new Random();
		int randomIndex = rng.nextInt(foods.length);
		
		Jhwon0324_Food randomFood = foods[randomIndex];
		
		randomFood.describe();
		
		randomFood.applyInflation();
		
		randomFood.describe();
	}
}
