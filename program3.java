import java.util.*;
class QueryDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int M=sc.nextInt();
		int B[][]=new int[M][2];
		for(int i=0;i<M;i++){
			for(int j=0;j<2;j++){
				B[i][j]=sc.nextInt();
			}
		}
		for(int k=0;k<B.length;k++){
			int L=B[k][0];
			int R=B[k][1];
			int sum=0;
			for(int i=L;i<=R;i++){
				sum=sum+arr[i];
			}
			System.out.print(sum +" ");
		}
		

	}
}
