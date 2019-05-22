import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		
		int[] numbers = {121,44547,4435,7976,3,436,343,124,342,123,652335,123};
		int n = 100000;
		int[] numbers1 = createRandomIntArray(n);  
		
		selectionSort(numbers);
		
		
		long start = System.currentTimeMillis();
		selectionSort(numbers1);
		double elapsed = (System.currentTimeMillis() - start)/1000.0;
		//System.out.println(Arrays.toString(numbers1));
		System.out.println(elapsed);
		
		Random r = new Random();
		String[] list1 = new String[n];
		for(int i = 0; i < n; i++) {
			String text = "some text with #" + r.nextInt(2*n);
			list1[i] = text;
		}
		long start1 = System.currentTimeMillis();
		mergeSort(list1);
		double elapsed1 = (System.currentTimeMillis() - start)/1000.0;
		//System.out.println(Arrays.toString(list1));
		System.out.println(elapsed1);
	}
	
	private static int[] createRandomIntArray(int size) {
		int aaa[] = new int[size];
		Random rand = new Random();
		int min = rand.nextInt(size);
		int max = rand.nextInt(size - min) + min;
		for(int i = 0; i < size; i++) {
			aaa[i] = rand.nextInt(max-min+1)+min;
		}
		return aaa;
	}

	//Selection Sort
	//Place elements of the array into a sorted order.
	//post: array is sorted in ascending order
	public static void selectionSort(int[] a) {
		for(int i = 0; i < a.length -1; i++) {
			//Find the smallest element
			int smallest = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[smallest]) {
					smallest  = j;
				}
			}
			swap(a, i, smallest); //Swap smallest to the front
		}
	}
	
	//Swap a[i] with a[j]
	private static void swap(int[] a, int i, int j) {
		if(i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	
	//Merge sort
	public static void mergeSort(String[] array) {
		if(array.length > 1) {
			//Split the array into two smaller arrays
			int size1 = array.length/2;
			int size2 = array.length-size1;
			
			String[] half1 = new String[size1];
			String[] half2 = new String[size2];
			
			for(int i = 0; i < size1; i++) {
				half1[i] = array[i];
			}
			
			for(int i = 0; i < size2; i++) {
				half2[i] = array[i + size1];
			}
			
			mergeSort(half1);
			mergeSort(half2);
			merge(array, half1, half2);
		}
	}

	private static void merge(String[] result, String[] list1, String[] list2) {
		int i1 = 0;
		int i2 = 0;
		for(int i = 0; i < result.length; i++) {
			if(i2 >= list2.length || (i1 < list1.length && list1[i1].compareTo(list2[i2]) <= 0)) {
				result[i] = list1[i1];
				i1++;
			} else {
				result[i] = list2[i2];
				i2++;
			}
		}
	}

}
