package practice;

import java.util.Scanner;

public class Exit {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (true) { // 無限ループ
			String line = sc.nextLine(); // 1行読み込み
			if (line.equals("exit")) { // 「exit」と等しい場合
				break; // breakしてループを抜ける
			}
			sb.append(line); // StringBuilderへ追加
		}
		System.out.println(sb.toString());
		sc.close(); // 最後はクローズする
	}

}
