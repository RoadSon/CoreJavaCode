package CoreJava.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
		//1. Collections.sort方法  对集合元素排序
		ArrayList<String> sortList = new ArrayList<>();
		sortList.add("aaa");
		sortList.add("bb");
		sortList.add("ba");
		Collections.sort(sortList);
		System.out.println(sortList.toString());// [aaa, ba, bb]
		Collections.sort(sortList,(a,b)->{
			return a.length()-b.length();
		});
		System.out.println(sortList.toString());// [ba, bb, aaa]
		
		//2. Collections.shuffle方法  随机打乱集合的元素
		ArrayList<Integer> shuffleList = new ArrayList<>();
		shuffleList.add(1);
		shuffleList.add(2);
		shuffleList.add(3);
		Collections.shuffle(shuffleList);
		System.out.println(shuffleList.toString());  //随即输出，也可能还是1,2,3
		
		//3. reverse()反转集合中元素的顺序
		ArrayList<Integer> reverseList = new ArrayList<>();
		reverseList.add(1);
		reverseList.add(2);
		reverseList.add(3);
		Collections.reverse(reverseList);
		System.out.println(reverseList); //[3, 2, 1]
		
		//4. max()\min()求集合的最大\最小值
		ArrayList<Integer> maxminList = new ArrayList<>();
		maxminList.add(1);
		maxminList.add(2);
		maxminList.add(3);
		System.out.println(Collections.max(maxminList));// 3
		System.out.println(Collections.min(maxminList));// 1
		
		//5. swap()交换集合的两个元素
		ArrayList<Integer> swapList = new ArrayList<>();
		swapList.add(1);
		swapList.add(2);
		swapList.add(3);
		Collections.swap(swapList, 0, 2);
		System.out.println(swapList.toString());// [3, 2, 1]
		
		//6. copy(List m,List n)将集合n中的元素全部复制到m中,并且覆盖相应索引的元素
		ArrayList<Integer> copy1List = new ArrayList<>();
		copy1List.add(1);
		copy1List.add(2);
		copy1List.add(3);
		//这样拷贝比较麻烦
		ArrayList<Integer> copy2List = new ArrayList<>(Arrays.asList(new Integer[copy1List.size()]));
		Collections.copy(copy2List, copy1List);
		//可以这样
		ArrayList<Integer> copy3List = new ArrayList<>(copy1List);
		//或者这样
		ArrayList<Integer> copy4List = (ArrayList<Integer>) copy1List.clone();
		System.out.println(copy2List.toString());// [1, 2, 3]
		
		//7. replaceAll(List list,Object old,Object new) 替换批定元素为某元素,若要替换的值存在刚返回true,反之返回false
		ArrayList<Integer> replaceAllList = new ArrayList<>();
		replaceAllList.add(1);
		replaceAllList.add(2);
		replaceAllList.add(3);
		replaceAllList.add(3);
		Collections.replaceAll(replaceAllList, 3, 1);
		System.out.println(replaceAllList); // [1, 2, 1, 1]
	}
}
