import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();        // 몇번 반복할지 정하기
        
        int i = 1;                    // 현재 반복 시점
        while(i<=t){                  // t번만큼 반복시킨다
        	int a = sc.nextInt();		// 반복 안에서 정수 2번을 입력받는다.
            int b = sc.nextInt();
        	System.out.println(a+b);    // a와 b를 더한다
            i++;                        // i(현재 반복시점)을 더한다
        }
        
    }
}