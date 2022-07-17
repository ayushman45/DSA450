
import java.util.*;

public class Sorting {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 205, 101, 203, 109, 59, 3, 45, 319, 316, 414 };
		while (true) {
			System.out.println("Enter 1 for bubble sort :");
			System.out.println("Enter 2 for insertion sort :");
			System.out.println("Enter 3 for selection sort :");
			System.out.println("Enter 4 for merge sort :");
			System.out.println("Enter 5 for quick sort :");
			System.out.println("Enter 6 for radix sort :");
			System.out.println("Enter 7 for count sort :");


			int flag = sc.nextInt();

			switch (flag) {
			case 1:
				bubble_sort(arr);
				break;
			case 2:
				insertion_sort(arr);
				break;
			case 3:
				selection_sort(arr);
				break;
			case 4:
				merge_sort(arr);
				break;
			case 5:
				quick_sort(arr);
				break;
			case 6:
				radix_sort(arr);
				break;
			case 7:
                count_sort(arr);
                break;
			default:
				System.out.println("Wrong input try again!");
				break;
			}
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+"  ");
			System.out.println();
		}
	}

	private static void quick_sort(int[] arr) {
		// TODO Auto-generated method stub
		quicksort(arr,0,arr.length-1);
	}

	private static void merge_sort(int[] arr) {
		// TODO Auto-generated method stub
		MERGE_SORT(arr,0,arr.length-1);
	}

	private static void selection_sort(int[] arr) {
		// TODO Auto-generated method stub
		int j = arr.length - 1;
		while (j > 0) {
			int max = 0;
			for (int i = 0; i <= j; i++) {
				if (arr[i] > arr[max]) {
					max = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[max];
			arr[max] = temp;
			j--;
		}

	}

	private static void insertion_sort(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int[]indexarr=new int[max+1];
		for(int i=0;i<arr.length;i++) {
			indexarr[arr[i]]=1;
		}
		int j=0;
		for(int i=0;i<indexarr.length&&j<arr.length;i++) {
			if(indexarr[i]==1) {
				arr[j]=i;
				j++;
			}
		}
	}

	private static void bubble_sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	static void radix_sort(int[] arr) {
		
		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		for(int i=0;i<=9;i++) {
			map.put(i, new LinkedList<Integer>());
		}

		int max_base = max(arr);


		for (int base = 1; base <= max_base; base++) {
			for (int i = 0; i < arr.length; i++) {
				
				map.get(compute(arr[i], base)).addLast(arr[i]);
				
			}
			int count = 0;
			for (int i = 0; i < 10; i++) {
				try {
					while (!map.get(i).isEmpty()) {
						arr[count] = map.get(i).peek();
						map.get(i).removeFirst();
						count++;
					}
				} catch (Exception e) {

				}
			}

		}
	}

	private static Integer compute(int i, int base) {
		// TODO Auto-generated method stub
		i = i % (int) Math.pow(10, base);
		i /= (int) Math.pow(10, base - 1);
		return i;
	}

	private static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		int digits = 0;
		while (max > 0) {
			digits++;
			max /= 10;
		}
		return digits;
	}
	
	static void MERGE_SORT(int[] arr, int lb, int ub) {
		if (lb == ub) {
			return;
		}
		int mid = lb + (ub - lb) / 2;
		MERGE_SORT(arr, lb, mid);
		MERGE_SORT(arr, mid + 1, ub);
		MERGE(arr, lb, mid, ub);
	}

	static void MERGE(int[] arr, int lb, int mid, int ub) {
		int n1 = mid - lb + 1;
		int n2 = ub - mid;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[lb + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = lb;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void quicksort(int[]arr,int lb,int ub) {
		int pivot=lb;
		int i=lb+1;
		int j=ub;
		while(i<j) {
			while(arr[i]<=arr[pivot])
				i++;
			while(arr[j]>=arr[pivot])
				j--;
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			int temp=arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
			try {
			quicksort(arr,lb,j-1);
			}
			catch(Exception e) {
				return;
			}
			try {
			quicksort(arr,j+1,ub);
			}
			catch(Exception e){
				return;
			}

	}
	static void count_sort(int []arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		int []newarr=new int[max+1];
		for(int i=0;i<arr.length;i++){
			newarr[arr[i]]++;
		}
		int k=0;
		for(int i=0;i<newarr.length;i++){
			if(newarr[i]==0){
				continue;
			}
			else{
				while(newarr[i]!=0){
					arr[k]=i;
                    k++;
					newarr[i]--;
				}
			}
		}
	}
}
