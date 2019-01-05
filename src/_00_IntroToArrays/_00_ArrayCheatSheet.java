package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] arr = {"String 1", "String 2","String 3", "String 4", "String 5" };
		//2. print the third element in the array
System.out.println(arr[3]);
		//3. set the third element to a different value
arr[3] = "Different String";
		//4. print the third element again
		System.out.println(arr[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0 ; i < arr.length ; i++) {
arr[i] = "String Choice";			
			
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
			
		}
		//7. make an array of 50 integers
int[] arr1 = new int[50];
Random rand = new Random();
		//8. use a for loop to make every value of the integer array a random number
for(int i = 0; i < arr1.length ; i ++ ) {
	int r = rand.nextInt(100);
	arr1[i] = r;	
}
		//9. without printing the entire array, print only the smallest number on the array
int small = arr1[0];
for( int i = 0 ; i < arr1.length ; i++ ) {
	if(arr1[i] < small ) {
		small = arr1[i];
		
	}
	
	
}
System.out.println(small);
		//10 print the entire array to see if step 8 was correct
for( int i = 0 ; i < arr1.length ; i ++) {
	System.out.println(arr1[i]);
	
}
		//11. print the largest number in the array.
int big = arr1[0];
for( int i = 0 ; i < arr1.length ; i++ ) {
	if(arr1[i] > big ) {
		big = arr1[i];
		
	}
	
	
}		
System.out.println(big);
		//12. print only the last element in the array
		System.out.println(arr1[arr.length - 1]);
	}
}
