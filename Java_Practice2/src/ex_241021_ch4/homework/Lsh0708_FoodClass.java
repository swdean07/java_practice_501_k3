package ex_241021_ch4.homework;

import java.util.Random;

public class Lsh0708_FoodClass {

	public static void main(String[] args) {
		
	Lsh0708_Food myFood = new Lsh0708_Food();
	myFood.name="김치볶음밥";
	myFood.price=6000;
	String[] foodMaterial = { "김치", "밥", "스팸", "식용유" };
	myFood.material=foodMaterial;

	myFood.introduce();

	String[] food1Material = { "김치", "밥", "스팸", "식용유" };
	Lsh0708_Food food1 = new Lsh0708_Food("김치볶음밥", 6000, food1Material);
	String[] food2Material = { "김", "밥", "햄", "오이" };
	Lsh0708_Food food2 = new Lsh0708_Food("김밥", 4000, food2Material);
	String[] food3Material = { "떡", "오뎅", "고추장" };
	Lsh0708_Food food3 = new Lsh0708_Food("떡볶이", 5000, food3Material);

	Lsh0708_Food menu[] = new Lsh0708_Food[3];menu[0]=food1;menu[1]=food2;menu[2]=food3;

	Random random = new Random();
	int rnd = random.nextInt(3);

	menu[rnd].introduce();
	}
}
