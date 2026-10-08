import java.util.Scanner;

public class linearSearch01 {
	public static void main(String[] args) {
		int [] nums = {96, 87, 18, 6, 31, 11, 56, 36, 76};
		
		for (int num : nums) {
			System.out.print(num + " ");
		}
		
		Scanner Input = new Scanner(System.in);
		System.out.print("\n\nInput a target number: ");
		int target = Input.nextInt();
		
		int index = linearSearch(nums, target);
		
		if (index != -1) {
			System.out.print("\nThe target " + target + " at index " + index);
		}else {
			System.err.println("\nCannot found " + target + " in this array");
		}
	}
	
	public static int linearSearch(int [] num, int target) {
		for (int i = 0;i <= num.length-1 ; i++) {
			if (target == num[i]) {
				return i;
			}
		}
		return -1;
	}
}
