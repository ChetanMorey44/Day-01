package Day02;

import java.util.*;

public class Scanners {
  
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in) ;
		
		System.out.println("insert your good name ");
		String name = sc.nextLine();
		
		System.out.println("Insert frist no :");
		int one = sc.nextInt();
		
		System.out.println("Insert second no :");
		int two = sc.nextInt();
		
		int sum = one + two;
		
		System.out.println( " Your name is : "+name+"  Your Score is : "+sum);
		
		
		
	}
}
