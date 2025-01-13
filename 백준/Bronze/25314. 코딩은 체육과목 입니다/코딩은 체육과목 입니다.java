// 4로 나눈 몫만큼 long 단어 추가
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        // 입력받는 정수 값
        int m = n/4;                 // 입력받은 값을 4로 나눈 몫 > 총 반복 횟수
        
        for(int i = 1; i<=m; i++){    // 1부터 시작, m까지
            System.out.print("long ");
        }
        System.out.print("int");
    }
}