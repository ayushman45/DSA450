package string;
import java.util.*;
import java.util.Map.Entry;
public class Q03 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String : ");
		String string=sc.next();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<string.length();i++) {
			if(!map.containsKey(string.charAt(i))){
				map.put(string.charAt(i), 1);
			}
			else {
				map.put(string.charAt(i), map.get(string.charAt(i))+1);
			}
		}
			System.out.println("Duplicate Characters : ");
		   Set<Entry<Character, Integer>> set = map.entrySet();
		      Iterator<Entry<Character, Integer>> iterator = set.iterator();
		      while(iterator.hasNext()) {
		         @SuppressWarnings("rawtypes")
				Map.Entry MAP = (Map.Entry)iterator.next();
		         if((int)MAP.getValue()>1) {
		        	 System.out.print(MAP.getKey()+"  ");
		         }
		      }
	}

}
