package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String args[]) {
		String[] a = {"Hello","My","Name","Is","Donkey","Kong"};
		randPrint(a);
	}
	
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void print(String[] s) {
		for(int i = 0; i < s.length ; i ++) {
		System.out.println(s[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	static//   in reverse order.
	void tnirp(String[] s) {
		for(int i = s.length ; i > 0; i --) {
			System.out.println(s[i -1 ]);
			
		}
		
	}
	
	
	static//4. Write a method that takes an array of Strings and prints every other String in the array.
	void pit(String[] s) {
		for(int i = 0; i < s.length ; i ++) {
			if(i % 2 == 1) {
				System.out.println(s[i]);
				
			}
			
		}
		
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	static void randPrint(String[] s) {
		Random rand = new Random();
		int x;
		int amount = s.length;
		while(s.length > 0) {
			x = rand.nextInt(s.length);
			if(s[x].equals("")) {
		
		
			}else {
				System.out.println(s[x]);
				s[x] = "";
				amount = amount - 1;
			}
	}
		}
}
