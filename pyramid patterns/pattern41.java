
import java.util.Scanner;

public class pattern41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=n; j++){
                if(i+j <= (n+1) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int k =1; k<=n; k++){
                if(k>=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
System.out.println("");
        }
        for(int i = 1; i<=n; i++){
        for(int k =1; k<=n; k++){
            if(k<=i){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        for(int j =1; j<=n; j++){
            if(i+j >= (n+1) ){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
System.out.println("");
        }
    }
}
       
        


