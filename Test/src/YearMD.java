import java.util.Calendar;
import java.util.Scanner;

/*
 *  ��Ŀ������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
	1.�����������3��5��Ϊ����Ӧ���Ȱ�ǰ�����µļ�������
	Ȼ���ټ���5�켴���µĵڼ��죬��������������������·ݴ���3ʱ�迼�Ƕ��һ�졣
 */
public class YearMD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������,��,�գ�");
		 int year = sc.nextInt();
	     int month = sc.nextInt();
	     int day = sc.nextInt();
	     Calendar cal = Calendar.getInstance();
	     cal.set(year, month - 1, day);
	     int sum = cal.get(Calendar.DAY_OF_YEAR);
	     System.out.println("��һ������һ��ĵ�" + sum +"��");


	}

}
