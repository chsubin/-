package baekjoon;
import java.util.Scanner;
public class Exam2_QuickSort {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		int []arr = new int[num];
        for(int i=0;i<num;i++){
           arr[i]=sc.nextInt(); 
        }
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
static void quickSort(int[]arr,int l,int r){
		if(l<r) {
			int p = partition(arr,l,r);
		
		quickSort(arr,l,p-1);
		quickSort(arr,p+1,r);
		}
		
	}

static	int partition(int[]arr,int l,int r) {
		int temp;
		int pivot = arr[l];
		int i=l;
		for(int j=l+1;j<=r;j++) {
			if(arr[j]<pivot) {i++;temp=arr[j];arr[j]=arr[i];arr[i]=temp;}
		}
		temp=arr[i];arr[i]=arr[l];arr[l]=temp;
		
		return i;
		}	
}

