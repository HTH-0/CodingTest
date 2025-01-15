import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        // 수열 길이 설정
        int[] Arr = new int[n];
        int m = sc.nextInt();
        
        
        for(int a= 0; a<m; a++) {		// k값을 m번만큼 갱신시킨다.
        int ii = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt(); 
        for(int i=ii; i<=j; i++){			//배열 i~j번째까지 k값을 넣는다
            Arr[i-1] = k;
        }   
        }
        for(int l=0; l<n; l++) {			// 배열을 출력
        	System.out.print(Arr[l]+" ");
        }
        sc.close();
    }
}