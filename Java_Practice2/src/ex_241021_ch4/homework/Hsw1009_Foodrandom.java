package ex_241021_ch4.homework;

import java.util.Random;

public class Hsw1009_Foodrandom {
	   public static void main(String[] args) {
	        // Food 객체 생성
	        Food[] foods = new Food[3];
	        foods[0] = new Food("돼지국밥", 9000, new String[]{"돼지고기", "밥", "국수", "육수"});
	        foods[1] = new Food("비빔밥", 8000, new String[]{"밥", "고추장", "야채", "계란"});
	        foods[2] = new Food("김치찌개", 7000, new String[]{"김치", "돼지고기", "두부", "양파"});

	        // 랜덤 추천 기능
	        Random random = new Random();
	        int randomIndex = random.nextInt(foods.length);

	        // 추천 음식 소개
	        System.out.println("추천 음식:");
	        foods[randomIndex].introduce();
	    }
	}
