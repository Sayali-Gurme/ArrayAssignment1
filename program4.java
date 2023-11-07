import java.util.*;
class TimeDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+(max-arr[i]);
		}
		System.out.println(sum);

	}
}
