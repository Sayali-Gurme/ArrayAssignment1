import java.util.*;
class SearchDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int B=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==B){
				count++;
			}
		}
		System.out.println(count);
	}
}
