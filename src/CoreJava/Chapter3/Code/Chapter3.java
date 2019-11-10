package CoreJava.Chapter3.Code;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter3 {
    public enum Color{
    	Red("红色",1),Green("绿色",2);
    	public String name;
    	public int index;
    	private Color(String name,int index) {
    		this.index = index;
    		this.name = name;
    	}
    }
	public static void main(String[] args) throws IOException {
		//1. String.join的用法
//		String[] string = {"a","b","c"};
//		ArrayList<String> strings = new ArrayList<>();
//		strings.add("a");
//		strings.add("b");
//		strings.add("c");
//		String string2 = String.join("-", string);
//		String string3 = String.join("-", "a","b","c");
//		String string4 = String.join("-", strings);
//		System.out.println(string4);
//		
		//2. 编译器让字符串共享
//		String aString = "aaa";
//		String bString = "aaa";
//		System.out.println(aString==bString);//true
//		String cString = "aaab";
//		String dString = cString.substring(0,3);
//		System.out.println(dString == aString);//false
//		
		//3. 码点
//		String greeting = "hello";
//		int cpCount = greeting.codePointCount(0, greeting.length());
//		System.out.println(cpCount);//输出为字母的个数
//		String str = "abc"; 
//        int[] codePoints = str.codePoints().toArray();
//        str = new String(codePoints, 0, codePoints.length);
//        for (int i = 0; i < str.length(); i++)
//            System.out.println(codePoints[i]);//对应abc的Unicode编码值97、98、99
////		String str = "\u03C0\uD835\uDD6B"; //\uD835\uDD6B 代表两个代码单元代，一个代码点
////		System.out.println(str.length());//输出3
////		System.out.println(str.codePointCount(0,str.length()));;//输出2
////		
//		//4. 输出三位小数
//		double i = 1/10;
//		System.out.printf("%.3f",i);
//		System.out.println(i);
//		
//		//5. 文件输入
//		//Scanner in = new Scanner(Paths.get("src/CoreJava/Chapter3/TSPdata.txt"),"UTF-8");
//		Scanner in = new Scanner("src/CoreJava/Chapter3/TSPdata.txt");//输出为src/CoreJava/Chapter3/TSPdata.txt
//		String string = in.nextLine();
//		System.out.println(string);
//		String string2 = System.getProperty("user.dir");//获得启动路径
//		System.out.println(string2);
////		
//		//6. 文件输出
//		PrintWriter printWriter = new PrintWriter("src/CoreJava/Chapter3/outPut.txt","UTF-8");
//		printWriter.write("a");
//		printWriter.write("b");
//		printWriter.close();
//        final char[] arr={'a', 'b', 'c', 'd', 'e' };
//        // 创建文件对应FileOutputStream
//        PrintWriter out = new PrintWriter("src/CoreJava/Chapter3/outPut.txt");
//        // 将字符串“hello PrintWriter”+回车符，写入到输出流中
//        out.println("hello PrintWriter");
//        // 将0x41写入到输出流中
//        // 0x41对应ASCII码的字母'A'，也就是写入字符'A'
//        out.write(0x41);
//        // 将字符串"65"写入到输出流中。
//        // out.print(0x41); 等价于 out.write(String.valueOf(0x41));
//        out.print(0x41);
//        // 将字符'B'追加到输出流中
//        out.append('B').append("CDEF");
//        // 将"CDE is 5" + 回车  写入到输出流中
//        String str = "GHI";
//        int num = 5;
//        out.printf("%s is %d\n", str, num);
//        out.close();
//        
//		//7. 枚举常量
//        for(Color color:Color.values()) {
//        	System.out.println(color+"\t颜色："+color.name+"编号："+color.index);
//        }
//		
//		//8. 带标签的continue和break
//		label:
//		for(int i =0;i<3;i++) {
//			System.out.println("aa");
//			for(int j=0;j<3;j++) {
//				if(j == 1) {
//					break label;
//				}
//			}
//		}
//		//9. BigDecimal
//		double i = 2-1.1;
//		System.out.println(i);//0.89999
//		BigDecimal bigDecimal = BigDecimal.valueOf(2-1.1);
//		System.out.println(bigDecimal);//0.89999
//		BigDecimal bigDecimal2 = new BigDecimal("2.0");//BigDecimal(double val)构造函数时仍会存在精度丢失问题，建议使用BigDecimal(String val)。
//		BigDecimal bigDecimal3 = new BigDecimal("1.1");
//		BigDecimal bigDecimal4 = bigDecimal2.subtract(bigDecimal3);
//		System.out.println(bigDecimal4);//0.9
//		BigDecimal bigDecimal5 = new BigDecimal("0.1");
//		System.out.println(bigDecimal5);
		
		//10. Arrays方法
		//1) Arrays.toString
		int[] a = {1,2,3};
		System.out.println(Arrays.toString(a));//[1,2,3]
		a = new int[] {4,5,6};
		System.out.println(Arrays.toString(a));//[4,5,6]
		int[][] b = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(b));//[[1, 2, 3], [4, 5, 6]]
		
		//2) Arrays.copyOf
		int[] c = {1,2,3};
		int[] d = c;//d和c地址相同
		//int[] d = Arrays.copyOf(c, c.length);//d和c地址不同
		d[0] = 0;
		System.out.println(c[0]);//如果是d=c，则输出0；如果是用copyOf方法，则输出1
		//但是对二维数组copyOf只是浅拷贝
		int[][] e = Arrays.copyOf(b, b.length);
		e[0][0] = 0;
		System.out.println(b[0][0]);//输出为0
		
		//3) Arrays.equals
		int[] t1 = {1,2,3};
		int[] t2 = {1,2,3};
		System.out.println(Arrays.equals(t1, t2));//true,比较数组的值
		System.out.println(t1.equals(t2));//false,比较两个地址是否相等
		
		int[][] o1 = {{1,2},{1,2}};
		int[][] o2 = {{1,2},{1,2}};
		System.out.println(Arrays.equals(o1, o1));//true，int是基本类型
		
		String[][] name1 = {{ "G","a","o" },{ "H","u","a","n"},{ "j","i","e"}};
		String[][] name2 = {{ "G","a","o" },{ "H","u","a","n"},{ "j","i","e"}};
		System.out.println(Arrays.equals(name1, name2));    // false，String不是基本类型，所以要用deepEquals比较
		System.out.println(Arrays.deepEquals(name1, name2));// true
		
	}
}

