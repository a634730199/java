/*
 * ������16�� ��Ŀ�����9*9�ھ��˷���
	1.����������������п��ǣ���9��9�У�i�����У�j�����С�
	�����ظ��ĳ˻���ȫ���Σ�
 */
public class Multiplication {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
			System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			System.out.println();
		}
		/*
		 * �����ظ��ĳ˻�(������)
		 */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++)
			System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			System.out.println();
			}


	}

}
