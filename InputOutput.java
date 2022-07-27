package Practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		// 1. take user's input for size
		int size = scan.nextInt();
		
		
		//2. Create an array
		int[] array = new int[size];
		
		
		
		//3. Take the input from user for array elements
		
		System.out.println("Enter the elements");
		
		for(int i = 0; i < array.length;i++) {
			array[i] = scan.nextInt();
			
			 // 3 4 5 6 5
		}
		
		//4. Display
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i]+" ");
			
			 
		}
		
		scan.close();
	}

}
