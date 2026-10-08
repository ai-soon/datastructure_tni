import java.util.Scanner;

public class binarySearch01 {
	public static void main(String[] args) {
		int [] nums = {96, 87, 18, 6, 31, 11, 56, 36, 76};
		
		nums = sorting(nums);
		
		for (int num : nums) {
			System.out.print(num + " ");
		}
		
		Scanner Input = new Scanner(System.in);
		System.out.print("\n\nInput a target number: ");
		int target = Input.nextInt();
		
		int index = binarySearch(nums, target);
		
		if (index != -1) {
			System.out.print("\nThe target " + target + " at index " + index);
		}else {
			System.err.println("\nCannot found " + target + " in this array");
		}
	}
	
	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}
	
	public static int binarySearch(int [] num, int target) {
		int low = 0;
		int high = num.length-1;
		
		while (low <= high) {
			int middle = (high + low)/2;
			if (target == num[middle]) {
				return middle;
			}
			else if (target < num[middle]) {
				high = middle -1;
			}else {
				low = middle +1;
			}
		}
		return -1;
	}
}
