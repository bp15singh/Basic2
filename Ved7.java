package basics;
import java.util.Scanner;
public class Ved7 {
public static void main(String[]arg){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number ");
int a=s.nextInt();

if(a%2==1){
	System.out.print("Number is not  prime ");
}
else if(a%3==1){
	
	System.out.print("Number is not prime "+ a);
}
else if(a%5==1){
	System.out.print("Number is not  prime ");
}
else if(a%7==1){
	System.out.print("Number is not  prime ");
	
}
else if(a%11==1){
	System.out.print("Number is not  prime ");
}
else{
	System.out.print("Number is  prime ");
}
}
}
