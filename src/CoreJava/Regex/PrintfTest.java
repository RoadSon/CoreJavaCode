package CoreJava.Regex;

public class PrintfTest {
	public static void main(String[] args) {
        double d = 345.678;  
        String s = "你好！";  
        int i = 1234;
		System.out.printf("%-9.2f", d);// "9.2"中的9表示输出的长度，2表示小数点后的位数。
		System.out.printf("%+9.2f%n", d);// "+"表示输出的数带正负号,%n表示换行
		System.out.printf("%-9.4f", d);// "-"表示输出的数左对齐（默认为右对齐）
	}
}
