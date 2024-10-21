package ex_241021_ch4.homework;

public class Hcb9404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 정의하기, Food 클래스를 정의
		// property로 이름(String name) 가격(int price) 재료들(String [] material)
		// method로 소개(속성 전체 소개)
		// 해당 food 클래스 3개, 배열로 만들어서 랜덤하게 추천하는 기능
		String [][] Material = {
				{"스파게티","올리브유","마늘","소금","면수"},
				{"베이컨","계란","양파","방울토마토","발사믹 드레싱"},
				{"크래커","과일","치즈","베이컨","마요네즈"}
				};
		
		Hcb9404_Food menu[] = {
				new Hcb9404_Food("알리오 올리오", 6400, Material[0]),
				new Hcb9404_Food("샌드위치", 6000, Material[1]),
				new Hcb9404_Food("카나페", 7000, Material[2])
		};
		
//		System.out.println("메뉴추천 1 : ");
//		Pasta.introduce();
//		System.out.println("메뉴추천 2 : ");
//		Salad.introduce();
//		System.out.println("메뉴추천 3 : ");
//		Canape.introduce();
		double r;
		r = Math.floor(Math.random()*3);
		
		menu[(int)r].introduce();
		
	}

}
