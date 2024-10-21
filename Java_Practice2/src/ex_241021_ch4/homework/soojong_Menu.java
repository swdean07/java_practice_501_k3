package ex_241021_ch4.homework;

import java.util.Random;

public class soojong_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] menu1Material = {"돼지","국","밥"};
		soojong_menuClass menu1 = new soojong_menuClass("돼지국밥", 9000, menu1Material);
		menu1.introduce();
		
		String [] menu2Material = {"순대","국","밥"};
		soojong_menuClass menu2 = new soojong_menuClass("순대국밥", 9000, menu2Material);
		menu2.introduce();
		
		String [] menu3Material = {"따로","국","밥"};	
		soojong_menuClass menu3 = new soojong_menuClass("따로국밥", 9000, menu3Material);
		menu3.introduce();
		
		System.out.println("랜덤");

		// 메뉴 배열
        soojong_menuClass[] menus = {menu1, menu2, menu3};
        
        System.out.println("랜덤 메뉴:");
        
        // 랜덤 객체 생성
        Random rand = new Random();
        int randomIndex = rand.nextInt(menus.length); // 메뉴 배열의 길이 내에서 랜덤 인덱스 선택
        menus[randomIndex].introduce(); // 랜덤으로 선택된 메뉴 소개
		
	}

}
