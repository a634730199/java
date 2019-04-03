import java.util.Scanner;

/*
 * ÈòÄê
 */
public class Runnian {

	public static void main(String[] args) {
		
		for(int i=1000;i<=2000;i++) {
			if(i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
				System.out.println("ÈòÄê\t" + i );
			}else {
				System.out.println(i + "no!!");
			}
		}

	}

}
