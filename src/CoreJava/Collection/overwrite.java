package CoreJava.Collection;

import java.util.HashMap;
import java.util.TreeMap;

public class overwrite implements Comparable{
	public int a;
	public overwrite(int val){
		this.a = val;
	}
	public String toString() {
		return a+"";
	}
	@Override
	public boolean equals(Object k){
		if(this == k){
			return true;
		}
		if(k instanceof overwrite){
			overwrite s = (overwrite)k;
			return ((overwrite) k).a == s.a;
		}
		return false;
	}
//	public int hashCode(){//不重写的话，下面的s1和s2的hashCode就会不同，但是s1和s2的id相同，理应认为s1=s2
//		return this.a*10;
//	}
	public static void main(String[] args){
		TreeMap<overwrite,Integer> test = new TreeMap<overwrite,Integer>();
		overwrite s1 = new overwrite(3);
		overwrite s2 = new overwrite(3);
		test.put(s1, 1);
		test.put(s2, 2);
		/**
		 * 不重写的情况
		 */
//		System.out.println(test.get(s1));//1
//		System.out.println(test.get(s2));//2
		test.forEach((k,v)->{
			System.out.println(k.a);
		});
		//map里面的key应该是唯一的，这样却失去了唯一性。
		//注意TreeMap不是按照对象的散列值存储的，是比较对象的compareTo方法
		//如果compareTo返回0，则表示两个对象相同，则只存最后put上去的对象
	}
	@Override
	public int compareTo(Object obj) {
		overwrite o = (overwrite) obj;
		return a-o.a;
	}
}

