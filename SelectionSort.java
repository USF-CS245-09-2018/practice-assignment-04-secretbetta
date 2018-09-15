
public class SelectionSort implements SortingAlgorithm {
	/**
	 * Sorts a list of integers using Selection Sort
	 * 
	 * @param a List of integers
	 */
	public void sort(int[] a) {
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
