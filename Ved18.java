package basics;

public class Ved18 {

public static void main(String []arg){
	
	int a=7;int b=8;int c=78;int d=89;
	
	if(a>b && a>c && a>d ){
		System.out.print("a=7 is higher among all");
	}
	
	else if(b>a && b>c && b>d){
		System.out.print("b=8 is higher among all");
	}
	
	else if(c>a && c>b && c>d){
		System.out.print("c=78 is higher among all");
	}
	else if(d>a && d>b && d>c){
		System.out.print("d=89 is higher among all");
	}
}
}
