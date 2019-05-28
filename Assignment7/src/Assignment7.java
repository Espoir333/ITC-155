
public class Assignment7 {

	public static void main(String[] args) {
		int a[] = {3,4,2,5,7,2,3,6,1,5,6,1,3,6,7,2,3,4,56,2,3,6,6,23,42,5623,6,235,62,35};
		selectionSort(a);
		for(int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		int b[] = {3,4,2,5,7,2,3,6,1,5,6,1,3,6,7,2,3,4,56,2,3,6,6,23,42,5623,6,235,62,35};
		modifiedSelectionSort(a);
		for(int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int smallest = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[smallest]) {
					smallest = j;
				}
			}
			swap(a, i, smallest);
		}
	}
	
	public static void modifiedSelectionSort(int[] a) {
		for (int i = a.length-1; i >= 0; i--) {
			int largest = i;
			for (int j = i-1; j >= 0; j--) {
				if (a[j] > a[largest]) {
					largest = j;
				}
			}
			swap(a, i, largest);
		}
	}

	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

}
