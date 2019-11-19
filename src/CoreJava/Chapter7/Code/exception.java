package CoreJava.Chapter7.Code;


public class exception<T> {
//	public static void print() {
//		T a;// error
//	}
	public static<T extends Comparable<T>> int f(int n,T t) {
		try {
			int r = n*n;
			return r;
		}finally {
			if(n == 2)
				return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(f(2,3));
	}
}
