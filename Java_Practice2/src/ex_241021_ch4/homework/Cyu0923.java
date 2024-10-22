package ex_241021_ch4.homework;

import java.util.Random;

public class Cyu0923 {

	public static void main(String[] args) {

		Cyu0923Class menu1 = new Cyu0923Class();
		menu1.name = "국밥";
		menu1.price = 8000;
		String[] menu1MateriaStrings = { "돼지고기", "새우젓", "다데기" };
		menu1.material = menu1MateriaStrings;
		menu1.introduce();

		Cyu0923Class menu2 = new Cyu0923Class();
		menu2.name = "우동";
		menu2.price = 6000;
		String[] menu2MateriaStrings = { "우동면", "육수", "유부" };
		menu2.material = menu2MateriaStrings;
		menu2.introduce();

		Cyu0923Class menu3 = new Cyu0923Class();
		menu3.name = "카레";
		menu3.price = 7000;
		String[] menu3MateriaStrings = { "카레 루", "당근", "감자" };
		menu3.material = menu3MateriaStrings;
		menu3.introduce();

		Cyu0923Class menuArray[] = new Cyu0923Class[3];
		menuArray[0] = menu1;
		menuArray[1] = menu2;
		menuArray[2] = menu3;

		Random random = new Random();
		int randomIndex = random.nextInt(menuArray.length); // 배열의 길이 내에서 무작위 인덱스 선택

		System.out.println("오늘의 추천 메뉴");
		menuArray[randomIndex].introduce(); // 랜덤으로 선택된 메뉴 소개
	}
}