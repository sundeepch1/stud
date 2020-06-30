import java.util.*;

public class StarTriangle9 {

    public static void main(String[] args) { 

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
	
        for (int i= a; i>= 1; i--) {

            for (int j=1; j<=a; j++){
		if(j>=a-i+1)
                    System.out.print("*");
		else{
		    System.out.print(" ");
		}
            }
            System.out.println();
        }
    } 
}
