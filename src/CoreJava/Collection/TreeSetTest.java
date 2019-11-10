package CoreJava.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new myCompare());
		treeSet.add(new Person("aa",2));
		treeSet.add(new Person("da",1));
		treeSet.add(new Person("ca",3));
		treeSet.add(new Person("db",3));
		for(Iterator iterator = treeSet.iterator();iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person.name+"  "+person.id);
		}
	}
}
class myCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		return p1.name.compareTo(p2.name);
	}
}