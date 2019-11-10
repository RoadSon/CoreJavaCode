package CoreJava.Regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) throws IOException {
//		String a = "a.b.c";
//		String reg = ".";
//		String[] result = a.split("\\.");
//		for(String r:result) {
//			System.out.println(r);
//		}
//		String str = "iq am your father";
//		String reg = "[a-z]{2}";
//		Pattern pattern = Pattern.compile(reg);
//		Matcher matcher = pattern.matcher(str);
//		System.out.println(matcher.matches());
//		while(matcher.find()) {
//			System.out.println(matcher.group());
//		}
//		String mail = "259387811@qq.com";
//		String reg = "[a-zA-Z0-9]+@qq.com";
//		System.out.println(mail.matches(reg));
		BufferedReader bReader = new BufferedReader(new FileReader("src\\JavaStudy\\test.txt"));
		//等于"src/JavaStudy/test.txt"
		String line = bReader.readLine();
		System.out.println(line);
	}
	public static void getMails_1()throws Exception
	{
		URL url = new URL("http://192.168.1.254:8080/myweb/mail.html");

		URLConnection conn = url.openConnection();

		BufferedReader bufIn = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String line = null;

		String mailreg = "\\w+@\\w+(\\.\\w+)+";
		Pattern p = Pattern.compile(mailreg);

		

		while((line=bufIn.readLine())!=null)
		{
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println(m.group());
			}
		}
	}
}
