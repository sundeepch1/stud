import java.util.*;

public class StarTriangle12 {

    public static void main(String[] args) { 

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
	int b = a;
        for (int i= 1; i<= a*2; i++) {

            for (int j=1; j<=a*2; j++){
		if(j>=a-b+1 && j<= a+b-1)
		    if((i+j)%2==0)
                        System.out.print("*");
		    else
			System.out.print(" ");
		else
		    System.out.print(" ");
            }
	    if(i<a)
		b--;
	    else
		b++;
            System.out.println();
        }
    } 
}
