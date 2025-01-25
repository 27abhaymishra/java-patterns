
import java.util.Scanner;

public class pattern40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int sp =1; sp<=n-i; sp++){
                System.out.print("  ");
            }
            for(int j =1; j<=i; j++){
                if(i==n || j==1 || j==i){
                    System.out.print("*   ");
                }else{
                    System.out.print("    ");
                }
            }
            for(int k =1; k<=n; k++){
                if(i==1 || i==n || k==n){
                    System.out.print("*   ");
                }else{
                    System.out.print("    ");
                }
            }
            System.err.println("");
        }
     for(int i = 1; i<=n; i++){
        for(int j = 1; j<=2*n; j++){
            if(i == n || j==1 || j==n || j==2*n){
                System.out.print("*   ");
            } else{
                System.out.print("    ");
            }
        }
      System.out.println("");
     }
    }
}
