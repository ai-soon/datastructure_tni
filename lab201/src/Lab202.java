import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int nums : initial_numbers) {
            numbers.add(nums);
        }

        System.out.print("Add number: ");
        int add_num1= scanner.nextInt();
        numbers.add(add_num1);

        System.out.print("Add number in position 4: ");
        int add_num2 = scanner.nextInt();
        numbers.add(3,add_num2);

        numbers.remove(8);

        numbers.set(0,9);

        System.out.println("After update arraylist: " + numbers);

    }
}
