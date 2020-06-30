import java.util.*;

public class StarTriangle11 {

    public static void main(String[] args) { 

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
	int b = 1;
        for (int i= 1; i<= a*2 - 1; i++) {

            for (int j=1; j<=a; j++){
		if(j>=a-b+1)
                    System.out.print("*");
		else
		    System.out.print(" ");
            }
	    if(i<a)
		b++;
	    else
		b--;
            System.out.println();
        }
    } 
}
