package taskday5;
import java.util.*;
public class OverLoadingexample {
	void add(int a,int b) {
		int c=a+b;
		System.out.println("addition of  integer numbers :" +c);
	}
	void add(float a,float b,float c) {
		System.out.println("addition of flaot  numbers :" +(a+b+c));
	}
	void add(double a,double b,double c) {
		System.out.println("addition of double  numbers :" +(a+b+c));
	}
	public static void main(String k[]) {
		OverLoadingexample o=new OverLoadingexample();
		o.add(10, 20);
		o.add(13.5f,156.2f,25.35f);
		o.add(52.3,25.3,6.9);
	}
}
