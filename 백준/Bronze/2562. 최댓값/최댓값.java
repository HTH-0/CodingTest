import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        //길이가 9인 수열
        int[] Arr = new int[9];
        for(int i = 0; i<9; i++){        // 수열을 입력받은 9개의 값으로 한다
            Arr[i] = sc.nextInt();
        }
        int x = Arr[0];                // x를 임의의 수열값으로 한다
        int num = 1;					// 순서를 기록할 변수 첫번째자리부터 시작
        for(int j=0; j<9; j++){          // 9번 반복
            if(x<Arr[j]){                // x는 수열의 최댓값
                x = Arr[j];
                num = j+1;
            }
        }
        System.out.println(x);
        System.out.print(num);
    }
}