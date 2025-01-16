import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        // 수열 길이 설정
        int[] Arr = new int[n];
        
        for(int b = 0; b<n; b++) {
        	Arr[b] = b+1;
        } // 수열은 1부터 1씩 증가함
        
        int m = sc.nextInt();
        
        for(int a= 0; a<m; a++) {		// i,j값을 m번만큼 갱신시킨다
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = Arr[i-1];
        Arr[i-1] = Arr[j-1];								// i,j번째 수열값을 서로 바꾼다
        Arr[j-1] = k;
        
        }
        for(int l=0; l<n; l++) {			// 배열을 출력
        	System.out.print(Arr[l]+" ");
        }
       
        
        sc.close();
    }
}