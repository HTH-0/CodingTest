import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();        // 총 금액 x
        int y = sc.nextInt();        // 총 물건 가짓수
        int i = 1;                   // 1부터 시작한다
        int product = 0;             // a와 b를 곱한 값을 저장해둘 변수
        while(i<= y){
            int a = sc.nextInt();    // 물건 한개의 가격
            int b = sc.nextInt();    // 물건 갯수
            product = a*b+product;   // a*b 값을 product에 더해준다
            i++;
        }
        if(product == x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }    
}