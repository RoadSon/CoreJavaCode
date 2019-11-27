package CoreJava.Chapter9.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListTest {
	public static ArrayList deleteRepeat(ArrayList data) {
		ArrayList newArray = new ArrayList();
		for(Iterator iterator = data.iterator();iterator.hasNext();) {
			Object object = iterator.next();
			if(!newArray.contains(object))
				newArray.add(object);
		}
		return newArray;
	}
	public static void print(ArrayList data) {
		for(Iterator iterator = data.iterator();iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person.name+"  "+person.id);
		}
	}
	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		test.add(new Person("a",1));
		test.add(new Person("b",2));
		test.add(new Person("c",3));
		test.add(new Person("a", 1));
		//print(test);
		test = deleteRepeat(test);
		print(test);
	}
}
