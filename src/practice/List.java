package practice;

import java.util.ArrayList;
import java.util.LinkedList;


public class List {
	
	public static void main(String[] args) {
	
	// ArrayListを生成する場合
	ArrayList<String> list1 = new ArrayList<String>();
	
	// LinkedListを生成する場合
	LinkedList<Integer> list2 = new LinkedList<Integer>();
	
	// 要素を追加する
	list1.add("りんご");
	list1.add("みかん");
	
	// 位置を指定して要素を追加する
	list1.add(1, "バナナ");
	
	// コレクションの要素数より大きい位置を指定すると実行時エラー
	// list1.add(5, "ドリアン");
	
	// 要素を取得する
	String item = list1.get(0);
	
	// 存在チェック (trueを返す)
	list1.contains("バナナ");

	// 存在チェック (falseを返す)
	list1.contains("なし");
	
	list1.size(); // 3を返す
	
	// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
	list1.remove("バナナ"); // 戻り値はtrue
	list1.remove("なし"); // 何もしない、戻り値はfalse

	// 位置を指定して要素を削除する
	list1.remove(0); //戻り値は"りんご"
	// list1.remove(5); // コレクションの要素数より大きい位置を指定すると実行時エラー
	
	
	System.out.println(list1);
	}

}
