import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        while(true){            // 무한루프 진입
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a==b && b==c && c==0){   // 000 입력시 탈출
                break;
            }
            if (a*a + b*b == c*c){
                System.out.println("right");
            }
            else if (a*a + c*c == b*b){
                System.out.println("right");
            }
            else if (c*c + b*b == a*a){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
            
        }
        
        
        
    }
}