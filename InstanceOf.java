package taskday5;
import java.util.*;
class Student{
}
class RockStar{
}
class Hacker{
}
public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		 
		 int scount=0,rcount=0,hcount=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 int  n=sc.nextInt();
		 System.out.println("enter class name");
		 String a[]=new String[n];
		 for(int j=0;j<n;j++) {
			 a[j]=sc.next();
		 }
		 for(int i=0;i<n;i++) {
			 
			if(a[i].equals("student")) {
				Student s=new Student();
				if(s instanceof Student) {
					scount++;
				}
			} else if(a[i].equals("rockstar")) {
				RockStar r=new RockStar();
					if(r instanceof RockStar) {
						rcount++;
					}
			}else if(a[i].equals("hacker")) {
				Hacker h=new  Hacker();
				if(h instanceof Hacker) {
					hcount++;
				}
			} else
			{
				System.out.println();
			}
		 }
		 
		 System.out.println(scount+" "+rcount+"  "+hcount);
		 
		 
		 

	}

}
