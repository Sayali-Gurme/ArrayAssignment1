import java.util.*;
class prefixsumDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int parr[]=new int[size];
		parr[0]=arr[0];
		for(int j=1;j<parr.length;j++){
			parr[j]=parr[j-1]+arr[j];
		}
		for(int i=0;i<parr.length;i++){
			System.out.print(parr[i]+" ");
		}
	}
}

