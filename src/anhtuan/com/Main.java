package anhtuan.com;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public void news(ArrayList<PhoneObject> arrt) {
		ArrayList<Integer> subject = new ArrayList<>() ;
		subject.add(1);
		subject.add(2);
		subject.add(4);
		subject.add(5);
		
		arrt.forEach(x -> {
			for (int i = 0; i < subject.size(); i++) {
				if (x.getId() == subject.get(i) && x.getTrangThai() == "on") {
					x.notifyCustom("thong bao" );
				}
			}

		});

	}

	public static void main(String[] args) {
		Random rd = new Random();

		ArrayList<PhoneObject> arr;
		arr = new ArrayList<>();
		arr.add(new IphoneX( 1, ( 1 + rd.nextInt(2) == 1) ? "on" : "off"));
		arr.add(new GalaxyS9( 2, ( 1 + rd.nextInt(2) == 1) ? "on" : "off"));
		arr.add(new GalaxyNote9( 3, ( 1 + rd.nextInt(2) == 1) ? "on" : "off"));
		Main m = new Main();
		m.news(arr);
		
	}

}
