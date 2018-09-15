
public class BubbleSort implements SortingAlgorithm {
	/**
	 * Sorts a list of integers using Bubble Sort
	 * 
	 * @param a List of integers
	 */
	public void sort(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
	}
}
