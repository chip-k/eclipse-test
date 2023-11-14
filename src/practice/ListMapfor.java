package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMapfor {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Listの例
		ArrayList<String> prefectures = new ArrayList<>();
		prefectures.add("北海道");
		prefectures.add("青森県");
		prefectures.add("秋田県");

		for (String prefecture : prefectures) {
		  System.out.println(prefecture); // 北海道、青森県、秋田県の順に表示
		}
		
		HashMap<Integer, String> classmates = new HashMap<>();
		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");

		// キーのみ
		for (Integer key : classmates.keySet()) {
		  System.out.println(key); // HashMapなので順序は不定
		}

		// 値のみ
		for (String name : classmates.values()) {
		  System.out.println(name); // HashMapなので順序は不定
		}

		// キーと値のペア
		for (HashMap.Entry<Integer, String> classmate : classmates.entrySet()) {
		  System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん"); // HashMapなので順序は不定
		}

	}

}
