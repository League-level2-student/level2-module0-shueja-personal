package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = {"one", "two", "three", "four", "five"};
		
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2]="3";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for ( int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int[] nums = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		for ( int i=0;i<nums.length; i++) {
			nums[i]=(int) (Math.random() * 100); 
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = nums[0];
		for ( int i=0;i<nums.length; i++) {
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for ( int i=0;i<nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println("");
		//10. print the largest number in the array.
		int largest = 0;
		for ( int i=0;i<nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}
		System.out.println(largest);
	}
}
