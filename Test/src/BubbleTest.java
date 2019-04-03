
public class BubbleTest {

	public static void main(String[] args) {
		int[] a = {1,6,42,11,5,99,0};
		int temp = -1;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if(a[j] < a[j+1]) {
	                temp = a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	            }
			}
		}
		for(int aa : a)
            System.out.print(aa+",");
        System.out.println();
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+",");
		}
		
	}

}
