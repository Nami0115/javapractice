package Practice16_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "斎藤";
		
		Hero h2 = new Hero();
		h2.name = "鈴木";
		
		ArrayList<String> al = new ArrayList<String>();
		al.add(h1);
		al.add(h2);
		
		for (i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		Map<Hero, Integer> enemies = new HashMap<Hero, Integer>();
		enemies.put(h1, 3);
		enemies.put(h2, 7);
		
		for (Hero key : enemies.keySet()) {
			Integer value = enemies.get(key);
			System.out.println(value);
		}
	}	
}
