package CoreJava.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetTest {
	public static HashSet deleteRepeat(HashSet data) {
		HashSet newArray = new HashSet();
		for(Iterator iterator = data.iterator();iterator.hasNext();) {
			Object object = iterator.next();
			if(!newArray.contains(object))
				newArray.add(object);
		}
		return newArray;
	}
	public static void print(HashSet data) {
		for(Iterator iterator = data.iterator();iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person.name+"  "+person.id);
		}
	}
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add(new Person("aa",1));
		hashSet.add(new Person("aa",2));
		hashSet.add(new Person("aa",1));
		print(hashSet);
		hashSet = deleteRepeat(hashSet);
		print(hashSet);
	}
}
