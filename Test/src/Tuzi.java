  /*
   	* ��Ŀ���ŵ����⣺
   	* ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
   	* С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ�������
   	* ��ÿ���µ���������Ϊ���٣�   
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

