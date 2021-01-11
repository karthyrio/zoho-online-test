
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = scan.nextInt();

        scan.close();
        
        int  i, j, min; 
    System.out.println("Value of N: " + N); 
  
    for (i = 1; i <= N; i++)  
    { 
        for (j = 1; j <= N; j++)  
        { 
            min = i < j ? i : j; 
            System.out.print(N - min + 1); 
        } 
        System.out.println(); 
    } 	}
}
