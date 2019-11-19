package CoreJava.Collection;

import java.util.Comparator;

public class Person implements Comparable{
	public String name;
	public int id;
	public String toString() {
		return name+" "+id;
	}
	public int compareTo(Object obj) {
		Person person = (Person) obj;
		if(this.id > person.id)
			return 1;
		else if(this.id == person.id) {
			return this.name.compareTo(person.name);
		}
		else {
			return -1;
		}
	}
	public Person(String name,int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
//	public int hashCode() {
//		return name.hashCode()+id*37;
//	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;
		else {
			Person person = (Person) obj;
			return this.name.equals(person.name) && this.id == person.id;
		}
	}
}
