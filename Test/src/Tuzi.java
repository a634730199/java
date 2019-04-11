  /*
   	* 题目：古典问题：
   	* 有一对兔子，从出生后第3个月起每个月都生一对兔子，
   	* 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
   	* 问每个月的兔子总数为多少？   
   */
public class Tuzi {
	public static void main(String[] args) {
		 int a = 2,b = 2,c;
		 int month = 0;
		 while(month < 1000) {
			 month++;
			 if(month >= 3) {
				 c = b;
				 b += a;
				 a = c;
				 
			 }
			 System.out.println(b);
		 }
	}
}

