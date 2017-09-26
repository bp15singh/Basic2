package basics;
import java.util.Scanner;
public class Ved5 {
	public static void main(String arg[]){
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1st number");
	int a=s.nextInt();
	System.out.println("Enter 2nd number");
	int b=s.nextInt();
	System.out.println("Enter 3rd number");
	int c=s.nextInt();
	System.out.println("Enter 4th number");
	int d=s.nextInt();
	
	if(a>b && a>c && a>d){
		
		System.out.print("1st number is grater among entered four number"+ a);
	}else if(b>a && b>c && b>d){
		System.out.print("2nd number is grater among entered four number"+ b);
	}else if(c>b && c>a && c>d){
	
	System.out.print("3rd number is grater among entered four number"+ c);


	}else if(d>a && d>b && d>c){
		
		System.out.print("4th  number is grater among entered four number"+ d);

	}

}
}
