import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            // 입력받는 수
        int i = 1;                        // 1부터 시작
        int sum = 0;                     // 합을 저장해둘 임의의 변수
        while(i<=n){                    // 1부터 n까지 반복한다
            sum += i;                  // sum은 i 와 sum을 합한 값으로 바뀐다 
            i++;                       // i에 1을 더한다
        }
        System.out.println(sum);        // 최종 sum값을 출력
    }
}