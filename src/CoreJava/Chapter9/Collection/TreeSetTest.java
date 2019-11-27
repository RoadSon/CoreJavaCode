package CoreJava.Chapter9.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		HashSet<Person> treeSet = new HashSet<>();
		treeSet.add(new Person("aa",1));
		treeSet.add(new Person("aa",1));
		treeSet.add(new Person("ca",3));
		treeSet.add(new Person("db",3));
//		for(Iterator iterator = treeSet.iterator();iterator.hasNext();) {
//			Person person = (Person) iterator.next();
//			System.out.println(person.name+"  "+person.id);
//		}
		treeSet.forEach(v->System.out.println(v));
//		ArrayList<String>[] arrayLists =new ArrayList<?>[10];
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add("a");
//		arrayList.add("b");
//		arrayList.forEach(action->{
//			String string = "ab";
//			System.out.println(string+action);
//		});
//		Iterator<String> iterator = arrayList.iterator();
//		iterator.forEachRemaining(action->System.out.println(action));
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "a");
//		map.put(2, "b");
//		map.forEach((k,v)->{
//			System.out.println(k+v);
//		});
	}
}
//class myCompare implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		Person p1 = (Person) o1;
//		Person p2 = (Person) o2;
//		return p1.name.compareTo(p2.name);
//	}
//}
