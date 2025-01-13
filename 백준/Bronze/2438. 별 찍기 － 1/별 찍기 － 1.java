import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();        // 줄 개수
        for(int k = 1; k<=n; k++){
        for(int i = n-k+1; i<=n; i++){   // 1부터 n까지 반복
        // n일때 별n개를 출력한다
            
            System.out.print("*");
            
         }
        
        
        System.out.println();
        }
        
        
    }
}