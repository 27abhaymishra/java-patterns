import java.util.*;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    
        for(int i =1; i<=n; i++){
         char x =(char)('A' + (i -1));
            for(int j =1; j<=i ; j++){
               
                System.out.print(x-- + " ");
              
            }
          
           
             
          
            System.out.println("");
        }
    }
}


