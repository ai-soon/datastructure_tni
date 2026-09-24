
public class TestApp {

	public static void main(String[] args) {
		
		int[] num = {11, 9, 23, 87, 38, 22, 92, 10};
		int[] num2= {25, 11, 45, 6, 87, 20, 78, 64};
		int[] num3= {68, 10, 87, 75, 14, 36, 98, 76};
		int[] num4= {87, 11, 26, 35, 49, 85, 21, 46};
		
		Sorting sort1 = new Sorting(num);
		sort1.bubbleSort();
		sort1.printSortedData();
		
		System.out.println("\n");
		Sorting sort2 = new Sorting(num2);
		sort2.selectionSort();
		sort2.printSortedData();
		
		System.out.println("\n");
		Sorting sort3 = new Sorting(num3);
		sort3.selectionSort();
		sort3.printSortedData();
		
		System.out.println("\n");
		Sorting sort4 = new Sorting(num4);
		sort4.quicksort();
		sort4.printSortedData();

	}

}
