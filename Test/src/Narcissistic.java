/*
 * 题目：
 * 打印出所有的 "水仙花数 "，
 * 所谓 "水仙花数 "是指一个三位数，
 * 其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 * 
         *Math.sqrt()//计算平方根
         *Math.cbrt()//计算立方根
         *Math.pow(a, b)//计算a的b次方
         *Math.max( , );//计算最大值
         *Math.min( , );//计算最小值
 */  
public class Narcissistic {
	public static void main(String[] args) {
		int a,b,c;
		for (int i = 101; i < 1000; i++) {
			a = i % 10;
			b = (i / 10) % 10;
			c = i / 100;
			if(i == (a*a*a + b*b*b + c*c*c)) {
				System.out.println("数字" + i);
			}
		}
	}

}
