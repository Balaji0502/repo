import java.util.*;
public class Sequence{
	static void Array(int[] arr){
		int lo=0;
int n=arr.length;
int hi=n-1;
int mid=0;
		while(mid<=hi){
			if(arr[mid]==0){
				int temp=arr[lo];
				arr[lo++]=arr[mid];
				arr[mid]=temp;
			}
			else if(arr[mid]==1){
				mid++;
			}
			else{
				int temp=arr[mid];
				arr[mid]=arr[hi];
				arr[hi--]=temp;
			}
		}

	}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
int[] arr=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
}
Array(arr);
for(int i=0;i<n;i++){
	System.out.print(arr[i]+" ");
}
}
}
