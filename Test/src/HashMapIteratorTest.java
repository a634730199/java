import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class HashMapIteratorTest {
	public static void main(String[] args) {
		int val = 0;
		String key = null;
		Integer value = null;
		Random r = new Random();
		HashMap map = new HashMap();
 
        for (int i=0; i<12; i++) {
         // �����ȡһ��[0,100)֮�������
        	val = r.nextInt(100);
              
        	key = String.valueOf(val);
              value = r.nextInt(5);
              // ��ӵ�HashMap��
              map.put(key, value);
              System.out.println(" key:"+key+" value:"+value);
          }
          // ͨ��entrySet()����HashMap��key-value
          iteratorHashMapByEntryset(map) ;
          
          // ͨ��keySet()����HashMap��key-value
          iteratorHashMapByKeyset(map) ;
          
          // ��������HashMap��value
          iteratorHashMapJustValues(map);        
      }
      
      /*
 50      * ͨ��entry set����HashMap
 51      * Ч�ʸ�!
 */
 private static void iteratorHashMapByEntryset(HashMap map) {
          if (map == null)
              return ;
  
          System.out.println("\niterator HashMap By entryset");
          String key = null;
          Integer integ = null;
          Iterator iter = map.entrySet().iterator();
         while(iter.hasNext()) {
             Map.Entry entry = (Map.Entry)iter.next();
              
              key = (String)entry.getKey();
              integ = (Integer)entry.getValue();
              System.out.println(key+" -- "+integ.intValue());
          }
     }
 
     /*
      * ͨ��keyset������HashMap
     * Ч�ʵ�!
    */
      private static void iteratorHashMapByKeyset(HashMap map) {
          if (map == null)
              return ;
  
         System.out.println("\niterator HashMap By keyset");
         String key = null;
          Integer integ = null;
          Iterator iter = map.keySet().iterator();
          while (iter.hasNext()) {
              key = (String)iter.next();
              integ = (Integer)map.get(key);
              System.out.println(key+" -- "+integ.intValue());
          }
      }
      
  
      /*
       * ����HashMap��values
       */
      private static void iteratorHashMapJustValues(HashMap map) {
          if (map == null)
              return ;
          
         Collection c = map.values();
          Iterator iter= c.iterator();
          while (iter.hasNext()) {             System.out.println(iter.next());
        }
     }
 }