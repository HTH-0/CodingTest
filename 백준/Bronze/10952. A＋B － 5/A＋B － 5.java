//무한루프 탈출은 00 부여시
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {			//무한루프
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	if(a==0 && b==0) {		// a 0 b 0 이면 탈출
        		break;				// 결과값 출력전에 탈출해야함.
        	}
        	System.out.println(a+b);
        	
        	
        }
    }
}