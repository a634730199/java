import java.util.Scanner;

/*
 * 题目：利用条件运算符的嵌套来完成此题：
 * 学习成绩> =90分的同学用A表示，
 * 60-89分之间的用B表示，60分以下的用C表示。  
 */
public class Score {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		char grade=score>=90?'A':score>=60?'B':'C';
		/*问号这个是三元表达式,有点等同于if(){}else{} 
		 * 例如 :c = a-b>0?1:2 如果a-b>0 那么c=1 如果a-b<=0 那么c=2 
		 */
		System.out.println(grade);

	}

}
