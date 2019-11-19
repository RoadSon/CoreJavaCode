package CoreJava.Chapter5.Code;

import java.util.Objects;


enum parameter{
	c1(2),c2(2),w(0.1);
	double i; 
	private parameter(double i) {
		this.i = i;
	}
	public double getValue() {
		return i;
	}
}
class person{
	String name = "hzl";
	int id = 0;
	public boolean equals(Object obj) {
		person oPerson = (person) obj;
		return this.id == oPerson.id && this.name.equals(oPerson.name);
	}
	public int hashCode() {
		return Objects.hash(name,id);
	}
	public person() {
		
	}
	public person(int id) {
		this.id = id;
	}
	public person(String name,int id) {
		// TODO Auto-generated constructor stub
		this(id);
		this.name = name;
	}
	public void print() {
		System.out.println(name);
	}
}
public class Extends extends person{
	public void abstractTest() {
		System.out.println("abstract");
	}
	private int extend = 1;
	public void test() {
		System.out.println("test");
	}
	public void print() {
		System.out.println(super.name+extend);
	}
	enum size{small,ss};
	public static void print(double ... s) {
		for(double e:s) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
//		person[] persons = new person[3];
//		Extends extends1 = new Extends();
//		persons[0] = extends1;
//		Extends extends2 = (Extends) persons[0];
//		Extends extends3 = (Extends) persons[1];
//		persons[0].print();
//		extends1.test();
//		//persons[0].test();//语法错误，编译器把persons[0]视作person对象，运行的时候才知道persons[0]引用了extends1
//		person p1 = new person();
//		person p2 = new person();
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p1.equals(p2));
//		
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		arrayList.add(0);
//		arrayList.add(1);
//		int[] a = new int[arrayList.size()];
//		System.out.println(arrayList.toArray());
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		arrayList.add(1);//等价于arrayList.add(Integer.valueOf(1)),这就是自动装箱
//		int a = arrayList.get(0);//自动拆箱
//		System.out.println(a);
//		ArrayList<Double[]> arrayList2 = new ArrayList<>();
//		Double[] bDoubles = new Double[2];
//		bDoubles[0] = 1.0;
//		bDoubles[1] = 2.0;
//		arrayList2.add(bDoubles);
//		for(Double[] b:arrayList2) {
//			System.out.println(Arrays.deepToString(b));
//		}
//		System.out.println(size.ss);\
//		System.out.println(parameter.c1.getValue());

	}
}
