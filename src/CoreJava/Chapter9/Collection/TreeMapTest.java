package CoreJava.Chapter9.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		String data = "aabbccda";
		TreeMap<Character, Integer> tm = new TreeMap<>(new myComparator());//只能对key排序
		//TreeMap可以取第一个元素		tm.firstKey()
		for(int i=0;i<data.length();i++) {
			if(tm.containsKey(data.charAt(i))) {
				tm.put(data.charAt(i), tm.get(data.charAt(i))+1);
			}
			else {
				tm.put(data.charAt(i), 1);
			}
		}
		Iterator<Character> it = tm.keySet().iterator();
		while(it.hasNext()) {
			char key = it.next();
			int value = tm.get(key);
			System.out.println(key+"  "+value);
		}
	}
}
class myComparator implements Comparator<Character>{

	@Override
	public int compare(Character arg0, Character arg1) {
		// TODO Auto-generated method stub
		
		return -arg0.compareTo(arg1);
	}
	
}

