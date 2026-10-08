import java.util.Scanner;

public class jumpSearch01 {

	public static void main(String[] args) {
		int[] nums = { 96, 87, 18, 6, 31, 11, 56, 36, 76 };

		nums = sorting(nums);

		for (int num : nums) {
			System.out.print(num + " ");
		}

		Scanner Input = new Scanner(System.in);
		System.out.print("\n\nInput a target number: ");
		int target = Input.nextInt();

		int index = jumpSearch(nums, target);

		if (index != -1) {
			System.out.print("\nThe target " + target + " at index " + index);
		} else {
			System.err.println("\nCannot found " + target + " in this array");
		}
	}

	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}

	public static int jumpSearch(int[] nums, int target) {
		int jump_size = (int) Math.floor(Math.sqrt(nums.length));

		int start = 0;
		int m = 0;

		while (m < nums.length) {
			if (nums[m] == target) {
				return m;
			} else if (nums[m] < target) {
				start = m;
				m += jump_size;
			} else {
				for (int i = start; i <= m; i++) {
					if (target == nums[i]) {
						return i;
					}
				}
				return -1;
			}
		}
		for (int i = start; i <= nums.length-1; i++) {
			if (target == nums[i]) {
				return i;
			}
		}
		return -1;
	}
}
