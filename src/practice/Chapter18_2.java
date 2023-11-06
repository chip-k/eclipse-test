package practice;

public class Chapter18_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 1から100までの値StringBufferに格納する
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(",");
			
		}
		// 最後のカンマを除去
		sb.deleteCharAt(sb.length() - 1);
		
		// カンマ区切りの文字列を出力
		String s = new String(sb);
		System.out.println(s);
		
		// 文字列をカンマで分割する
		String[] array = s.split(",");
		for (String d : array) {
			System.out.println(d);
		}
	}

}
