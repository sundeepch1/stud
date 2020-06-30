import java.util.*;

public class StarTriangle5 {

    public static void main(String[] args) { 

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        for (int i= 1; i<= a; i++) {

            for (int j=1; j<=a*2; j++){
                if(j>=(a-i+1) && j<=(a+i-1)){
                      if((i+j)%2==0)
                     	System.out.print("*");
		      else
			System.out.print(" ");
                }else if(j<(a-i+1)){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
}
