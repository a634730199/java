/*
 * ��Ŀ��
 * ��ӡ�����е� "ˮ�ɻ��� "��
 * ��ν "ˮ�ɻ��� "��ָһ����λ����
 * ���λ���������͵��ڸ�������
 * ���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
 * 
         *Math.sqrt()//����ƽ����
         *Math.cbrt()//����������
         *Math.pow(a, b)//����a��b�η�
         *Math.max( , );//�������ֵ
         *Math.min( , );//������Сֵ
 */  
public class Narcissistic {
	public static void main(String[] args) {
		int a,b,c;
		for (int i = 101; i < 1000; i++) {
			a = i % 10;
			b = (i / 10) % 10;
			c = i / 100;
			if(i == (a*a*a + b*b*b + c*c*c)) {
				System.out.println("����" + i);
			}
		}
	}

}
