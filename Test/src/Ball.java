/*
 * ��Ŀ��һ���100�׸߶��������£�
 * ÿ����غ�����ԭ�߶ȵ�һ�룻
 * �����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�
 */
public class Ball {
	public static void main(String[] args) {
		double s = 0;
		double h = 100;
		for (int i = 1; i <= 10; i++) { 
			s += h * 1.5; h = h / 2;
		}
		System.out.println("����·�̣�" + s); 
		System.out.println("�����߶ȣ�" + h);


	}

}
