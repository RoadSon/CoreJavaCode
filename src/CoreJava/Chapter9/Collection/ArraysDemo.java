package CoreJava.Chapter9.Collection;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		/**
		 * Arrays:用于操作数组的工具类。
		 * 里面都是静态方法。
		 */
		//1. Arrays.asList(T… data)将数组转为集合
		String[] strings = {"a","b"};
		List<String> sList = Arrays.asList(strings);
		sList.forEach(s->System.out.println(s));
		
		int[] a = {1,2,3};
		List<int[]> iList = Arrays.asList(a);
		iList.forEach(action->System.out.println(Arrays.toString(action)));//[1,2,3]
		
		Integer[] aIntegers = {1,2,3};
		List<Integer> iList2 = Arrays.asList(aIntegers);
		iList2.forEach(action->System.out.println(action));//1,2,3
		
		//2. Arrays.fill(Object[] array, int fromIndex, int toIndex, Object obj)从起始位置到结束位置，取头不取尾
		int[] c = {1,2,3,4,5};
		Arrays.fill(c,0,2,0);
		System.out.println(Arrays.toString(c));//[0,0,3,4,5]
		
		//3. Arrays.sort(T[] array, Comparator<? super T> comparator)使用自定义比较器，对数组元素进行排序 (串行排序)
		String[] str = {"ab","c","dd","aaa"};
		Arrays.sort(str);//默认按字典顺序比较
		System.out.println(Arrays.toString(str));//[aaa, ab, c, dd]
		Arrays.sort(str,(o1,o2)->{
			return o1.length()-o2.length();
		});//lambda方式自定义比较器，按字符串长度排序
		System.out.println(Arrays.toString(str));//[c, ab, dd, aaa]
		
		//4. Arrays.binarySearch(Object[] array, Object key)在调用该方法之前，必须先调用 Arrays.sort() 方法进行排序，
		//如果数组没有排序，那么结果是不确定的，此外如果数组中包含多个指定元素，则无法保证将找到哪个元素
		//注意：当搜索元素是数组元素时，返回该元素的索引值；当搜索元素不是数组元素时，返回 - (索引值 + 1)
		int[] binaryArray = {1,3,5,7};
		System.out.println(Arrays.binarySearch(binaryArray, 1));//print 0
		System.out.println(Arrays.binarySearch(binaryArray, 2));//print -(1+1)
		System.out.println(Arrays.binarySearch(binaryArray, 0));//print -(0+1)
		System.out.println(Arrays.binarySearch(binaryArray, 9));//print -(4+1)
		
		//5. Arrays.copyOf(T[] original, int newLength)其内部调用了 System.arraycopy() 方法
		//从下标 0 开始，如果超过原数组长度，则会用 null 进行填充
		int[] copyArray = {1,2,3,4};
		int[][] twoDimension = {{1,2},{3,4}};
		int[] copy1 = Arrays.copyOf(copyArray,copyArray.length);
		copy1[0] = 0;
		int[][] copy2 = Arrays.copyOf(twoDimension, twoDimension.length);
		copy2[0][0] = 0;
		System.out.println(Arrays.toString(copyArray));//print [1, 2, 3, 4]
		System.out.println(Arrays.deepToString(twoDimension));//print [[0, 2], [3, 4]] 未成功拷贝
		for(int i=0;i<twoDimension.length;i++) {
			copy2[i] = Arrays.copyOf(twoDimension[i], twoDimension[i].length);
		}
		copy2[0][0] = 1;
		System.out.println(Arrays.deepToString(twoDimension));//print [[0, 2], [3, 4]] 成功拷贝,twoDimension[0][0]不为1
	}
}
