package ex_241021_ch4.homework;

public class jih0316_Foodintroduce {
	public static void main(String[] args) {
		String[] saladMaterials = { "양상추", "드레싱소스", "토마토" };
		jih0316_Food saladFood = new jih0316_Food("salad", 10000, saladMaterials);

		saladFood.introduce();
	}
}