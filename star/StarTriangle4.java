import java.util.*;

public class StarTriangle4 {

    public static void main(String[] args) { 

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
	int star = 1;
        for (int i= 1; i<= a*2-1; i++) {

            for (int j=1; j<=a*2; j++){
                if(j>=(a-star+1) && j<=(a+star-1)){
                     System.out.print("*");
                }else if(j<(a-star+1)){
                    System.out.print(" ");
                }
            }
	    if(i<a)
	    	star++;
	    else 
		star--;
            System.out.println();
        }
    } 
}
