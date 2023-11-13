package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Chapter3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDate d1 = LocalDate.of(2021, 10, 10);
		// 曜日を取得
		DayOfWeek week = d1.getDayOfWeek();
		// 曜日の文字列表現を取得
		String str = week.getDisplayName(TextStyle.SHORT, Locale.getDefault());
		System.out.println(str);

	}

}
