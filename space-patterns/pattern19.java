import java.util.Scanner;

public class pattern19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n; j++){
            if((i<(n+1)/2 && j==1) || (i>(n+1)/2 && j==n)){
                    System.out.print("* ");
                }
               else if(i ==1 || i==n  || i == (n+1)/2 ){
                    
                      System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
