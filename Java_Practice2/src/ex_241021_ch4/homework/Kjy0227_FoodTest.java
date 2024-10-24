package ex_241021_ch4.homework;

import java.util.Random;

public class Kjy0227_FoodTest {

	public static void main(String[] args) {
		String[] materials1 = {"떡", "어묵", "고추장", "설탕"};
		Kjy0227_Food food1 = new Kjy0227_Food("떡볶이", 15000, materials1);
		
		// 메뉴 소개
		food1.introduce();
		
		// 메뉴 랜덤 추천
		String[] materials2 = {"김치", "돼지고기", "두부"};
		Kjy0227_Food food2 = new Kjy0227_Food("김치찌개", 8000, materials2);
		String[] materials3 = {"밥", "김", "단무지", "햄", "당근"};
		Kjy0227_Food food3 = new Kjy0227_Food("김밥", 4000, materials3);
		
		Kjy0227_Food[] foods = new Kjy0227_Food[3];
		foods[0] = food1;
		foods[1] = food2;
		foods[2] = food3;
		
		randomMenu(foods);
	}
	
	public static void randomMenu(Kjy0227_Food[] foods) {
		Random random = new Random();
		foods[random.nextInt(3)].introduce(); // 3 미만 랜덤 정수
	}

}
