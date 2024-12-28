import java.util.*;
public class pattern33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        for(int i = 1 ; i<n; i++){
            for(int space = 1; space <=n-i; space++){
                System.out.print("  ");
            }
           for(int j =1; j<=2*i-1; j++){
           if(i<=(n+1)/2 &&(j==1 || j==2*i-1 )|| j==i ){
            System.out.print("* ");
           }else{
            System.out.print("  ");
           }
           }
           System.out.println("");
        }
        
    }
}