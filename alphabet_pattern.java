import java.util.*;
public class Alphabet_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++) {
				System.out.print((char)(65+k)+"");
			}
			System.out.println();
		}
	}

}
