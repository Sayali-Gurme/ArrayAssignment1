import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int maxRight=arr[arr.length-1];
		System.out.print(maxRight+" ");
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>maxRight){
				System.out.print(arr[i]+" ");
				maxRight=arr[i];
			}
		}
	}
}
