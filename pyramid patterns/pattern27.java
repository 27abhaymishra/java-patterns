import java.util.*;
public class pattern27{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        for(int i = 1 ; i<=n; i++){
            for(int j =1; j<=n; j++){
                 if( j>=i){
                    System.out.print("* ");
                 }
                    System.out.print("  ");
                 
            }
            System.out.println("");
        }
    }
}
