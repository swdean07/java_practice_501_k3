package ex_241021_ch4.homework;

import java.security.PublicKey;
import java.util.Random;

public class LsyTest1205 {
	public static void main(String[] args) {
		String[] food1Materials = { "소고기", "피망", "양파" };
		FoodLsy1205 food1 = new FoodLsy1205("찹스테이크", 20000, food1Materials);
//		food1.showInfo();
		
		String[] food2Materials = { "가래떡", "만두", "양파" };
		FoodLsy1205 food2 = new FoodLsy1205("떡만두국", 6000, food2Materials);
//		food2.showInfo();
		
		String[] food3Materials = { "참치", "햄", "계란" };
		FoodLsy1205 food3 = new FoodLsy1205("참치볶음밥", 6000, food3Materials);
//		food3.showInfo();
		
		// 음식들을 담을 배열 정의. 
		FoodLsy1205 [] foods = {food1,food2,food3};
		
		// 음식 랜덤 추천 테스트. 먼저 랜덤 숫자 확인. 
		randomRecommendFood(foods);
		
		
	}
	
	// 메서드 기능에서, 파라미터로, 음식들을 담아놓은 배열을 받기. 
	public static void randomRecommendFood(FoodLsy1205 [] foods) {
		Random random = new Random();
		int randomNumber = random.nextInt(3); // 3 미만의 정수를 뽑기, 
		System.out.println("랜덤숫자 확인 : " + randomNumber);
		foods[randomNumber].showInfo();
		
	}

}




