package CoreJava.AbstractClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class employee{
	private int id;
	private String name;
	public employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
	void work() {
		System.out.println("aa");
	}
	public void getWork() {
		work();
	}
}
interface inter{
	int a = 1;
	void show();
}
interface inter1{
	int a = 3;
}
interface inter2 extends inter,inter1{
	int a = 2;
}
public class AbstractTest extends employee implements inter2{
	private int bonner;
	public void show() {
		System.out.println(a);
	}
	public AbstractTest(int id, String name,int bonner) {
		super(id, name);
		// TODO Auto-generated constructor stub
		this.bonner = bonner;
	}
	public static void sop(Object o) {
		System.out.println(o);
	}
//	void work() {
//		// TODO Auto-generated method stub
//		System.out.println("manager");
//	}
	public static void main(String[] arguments) {
//		abstractTest abstractTest = new abstractTest(0, "aa", 1);
//		abstractTest.show();
//		System.out.println(inter.a);
//		System.out.println(abstractTest.a);
		List te = new ArrayList();
		te.add("a");
		te.add(0,"b");
		Iterator iterator =te.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		sop("a");
	}
	
}
