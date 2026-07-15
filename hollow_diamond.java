import java.util.*;
public class hollow_diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            	System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) 
                	System.out.print("*");
                else 
                	System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
            	System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) 
                	System.out.print("*");
                else
                	System.out.print(" ");
            }
            System.out.println();
        }
    }
	}
