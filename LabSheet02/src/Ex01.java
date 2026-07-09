
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {23, 67, 8, 91, 45, 12, 78};
		
		System.out.println("lenght = " + nums.length);
		System.out.println("First num = " + nums[0]);
		System.out.println("Last num = " + nums[nums.length-1]);
		System.out.println("Middle num = " + nums[nums.length/2]);
		
		System.out.println("\nDisplay all elements: ");
		boolean first_element = true;
		for (int num : nums) 
		{
			System.out.print((!first_element? ", " : "") + num); //condition ? true_result : flase_result
			first_element = false;
		}

	}

}
