import java.util.*;
public class zig_zag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows");
		int n=sc.nextInt();
		System.out.print("Enter number of Columns");
		int m=sc.nextInt();
		int mat[][]=new int[n][m];
		int num=1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<m;j++) {
					mat[i][j]=num++;
				}
			}
			else {
				for(int j=m-1;j>=0;j--) {
					mat[i][j]=num++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
