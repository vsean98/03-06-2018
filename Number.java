package bass;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner scanner=new Scanner(System.in);
	
System.out.println ("Please enter three number ");
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	int c=scanner.nextInt();
if((a>b) &&(a>c)) {

System.out.println(a + "is the largest number");
        
}else if((b>c) &&(b>c)) {

System.out.println(b + "is the largest number");   
        
}else {
System.out.println(c + "is the larger number");

}


if((a<b) &&(a<c)) {

System.out.println(a + "is the smallest number");



}else if((b<c) &&(b<a)) {

System.out.println(b + "is the smallest number");



}else {

System.out.println(c + "is the smallest number");
	}

}
}