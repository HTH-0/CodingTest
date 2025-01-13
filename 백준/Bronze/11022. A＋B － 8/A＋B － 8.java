import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();        //테스트 개수
        for(int i = 1; i<=t; i++){     // 1부터 시작해서 t번만큼
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.printf("Case #%d: %s + %s = " + (a+b) +"\n",i,a,b);
        }
    }
}