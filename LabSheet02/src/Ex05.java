
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberArrayControler nums = new NumberArrayControler();
		nums.display("Display an initial array:");
		
		int[] new_nums = new int[nums.getNums().length-1];
		
		//copy data from nums -> new_nums start from index 1
		for (int i = 0; i < new_nums.length; i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		//display result
		nums.setNums(new_nums);
		nums.display("\n\nAfter delete the last element:");

	}

}
