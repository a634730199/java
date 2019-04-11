import java.util.Calendar;
import java.util.Scanner;

/*
 *  题目：输入某年某月某日，判断这一天是这一年的第几天？
	1.程序分析：以3月5日为例，应该先把前两个月的加起来，
	然后再加上5天即本月的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
 */
public class YearMD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年,月,日：");
		 int year = sc.nextInt();
	     int month = sc.nextInt();
	     int day = sc.nextInt();
	     Calendar cal = Calendar.getInstance();
	     cal.set(year, month - 1, day);
	     int sum = cal.get(Calendar.DAY_OF_YEAR);
	     System.out.println("这一天是这一年的第" + sum +"天");


	}

}
