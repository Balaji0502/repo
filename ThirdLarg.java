import java.util.*;
public class ThirdLarg{
	static int findThird(int[] arr){
		int n=arr.length;
		int first=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>first) first=arr[i];
		}
		int second=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>second && arr[i]<first){
				second=arr[i];
			}
}
		int third=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i]>third && arr[i]<first && arr[i]<second){
				third=arr[i];
			}
	}
			return third;
	}
public static void main(String args[]){
	int[] arr={2,4,6,7,8};
	System.out.println(findThird(arr));
}
}
