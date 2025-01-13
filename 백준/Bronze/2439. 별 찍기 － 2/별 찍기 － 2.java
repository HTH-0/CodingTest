import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n층일때 i층 기준 공백은 n-i번 별은 i개
        for(int i = 1; i<=n; i++) {
        	
        	for(int j=i+1; j<=n ; j++) {			// 공백 n-i개만큼 반복
        		System.out.print(" ");
        	}
        	for(int k=1; k<=i; k++) {                // 별 i개 만큼 반복
        		System.out.print("*");
        	}
        	System.out.println();                    // 한바퀴돌고 줄바꿈
        }
        
      
        
    }
}