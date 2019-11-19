package CoreJava.Chapter6.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

interface test1{
	default void print() {
		System.out.println("aaa");
	};
	int a = 1;
	static void print1() {
		System.out.println("aaa");
	}
}
interface test2{
	default void print2() {
	}
}
interface extendTest extends test1,test2{

}
class test implements extendTest,Cloneable{
	protected test clone() throws CloneNotSupportedException {
		test clone = (test) super.clone();
		clone.arrayList = (ArrayList<Integer>) this.arrayList.clone();
		return clone;
	}
	public int t = 1;
	public ArrayList<Integer> arrayList = new ArrayList<>(); 
}
class lengthComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}
}
public class Interface {
	public static void main(String... args) throws CloneNotSupportedException {
		String[] strings = {"aaaaa","ccc"};
		Arrays.sort(strings,(String o1,String o2) -> o1.length() - o2.length());
		System.out.println(Arrays.deepToString(strings));
		test t1 = new test();
		test t2 = t1.clone();
		t2.arrayList.add(0);
		System.out.println(t1.arrayList.size());
//		()->{
//			for(int i=0;i<2;i++) {
//				System.out.println(i);
//			}
//		};
	}
}
