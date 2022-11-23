package Controller;

import java.util.ArrayList;

import Model.Restaurant;
import Model.Salon;

public class StoreController {

	ArrayList<Restaurant> re = new ArrayList<Restaurant>();
	ArrayList<Salon> sa = new ArrayList<Salon>();

	public StoreController() {
		re.add(new Restaurant("해성식당", "음식점", 70, 81, 70, 80));
		re.add(new Restaurant("정림이네", "음식점", 80, 87, 75, 85));
		re.add(new Restaurant("왕뼈사랑", "음식점", 80, 91, 78, 84));

		sa.add(new Salon("박승철", "헤어샾", 70, 81, 70));
		sa.add(new Salon("이가자", "헤어샾", 80, 87, 75));
		sa.add(new Salon("리안", "헤어샾", 80, 91, 78));

	}

	public void getRe() {
		for (int i = 0; i < re.size(); i++) {
			System.out.println(i + 1 + ". " + re.get(i).name + "      평점 : "
					+ ((re.get(i).price + re.get(i).flavor + re.get(i).clean + re.get(i).service) / 4));
		}
	}

	public void getSa() {
		for (int i = 0; i < re.size(); i++) {
			System.out.println(i + 1 + ". " + sa.get(i).name + "      평점 : "
					+ ((re.get(i).price + re.get(i).flavor + re.get(i).clean + re.get(i).service) / 4));
		}
	}

	public void getgra(String name) {
		int i = 0;
		while (i < re.size()) {
			if (re.get(i).name.equals(name)) {
				System.out.println("가게명 : " + name);
				System.out.println("10\t 20\t 30\t 40\t 50\t 60\t 70\t 80\t 90\t 100");
				double j = ((re.get(i).price + re.get(i).flavor + re.get(i).clean + re.get(i).service) / 4);
				double avg = j / 10;
				for (int k = 1; k < avg; k++) {
					System.out.print("*\t");
				}
				System.out.println();
				break;
			}
			i++;
		}
	}

	public void total() {
		int j = 0;
		for(int k=10; k>=1; k--) {
			System.out.print(k*10);
			if(re.get(j)!=null) {
				double num = ((re.get(j).price + re.get(j).flavor + re.get(j).clean + re.get(j).service) / 4);
				double avg = j / 10;
				if(avg >= (k*10));
				System.out.println("\t*");
			}
		}
		for(int i=0;i<re.size();i++) {
			System.out.print("\t"+re.get(i).name);
			System.out.print("\t"+sa.get(i).name);			
		}System.out.println();
	}
}
