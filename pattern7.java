import java.util.*;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char x = 'A';
        for(int i =1; i<=n; i++){
          
            for(int j =1; j<=i ; j++){
                System.out.print(x++ + " ");
                
            }
          
            System.out.println("");
        }
    }
}


