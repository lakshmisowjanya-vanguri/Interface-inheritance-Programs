package taskday5;
import java.util.*;
public class StringRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		System.out.println("enter two numbers ");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("length of the string   "+str.length());
		System.out.println("substring is "+str.substring(a,b));
	}

}
