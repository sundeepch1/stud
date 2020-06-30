import java.util.*;

public class StarTriangle14 {

	public static void main(String[] args) { 

	        System.out.println("Enter number");
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
		int star = 3;
	        for (int i= 1; i<= a; i++) {
		        for (int j=1; j<=a*2-1; j++){
		    		if((i+j)==(a+1) || (i+j)==(a+star) || i==a){
                        		System.out.print(star);
		        		if((i+j)==a+star)
			    			star = star + 2;
		    		}
				else{
		    			System.out.print(" ");
				}
            		}
            		System.out.println();
        	}
    	} 
}
