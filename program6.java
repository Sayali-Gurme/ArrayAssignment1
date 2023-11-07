import java.util.*;
class puzzleDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int mul=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			mul=mul*arr[i];
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(mul/arr[i] +" ");
		}
	}
}
