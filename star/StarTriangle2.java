import java.util.*;

public class StarTriangle2 {

    public static void main(String[] args) { 

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        for (int i= 1; i<= a; i++) {

            for (int j=1; j<=a; j++){
                if(j>=a-i+1 ){
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
}