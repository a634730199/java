import java.util.Scanner;

/*
 * ��Ŀ�����������������Ƕ������ɴ��⣺
 * ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��
 * 60-89��֮�����B��ʾ��60�����µ���C��ʾ��  
 */
public class Score {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		char grade=score>=90?'A':score>=60?'B':'C';
		/*�ʺ��������Ԫ���ʽ,�е��ͬ��if(){}else{} 
		 * ���� :c = a-b>0?1:2 ���a-b>0 ��ôc=1 ���a-b<=0 ��ôc=2 
		 */
		System.out.println(grade);

	}

}
