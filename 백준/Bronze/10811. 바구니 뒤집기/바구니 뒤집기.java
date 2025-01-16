import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n은 배열 길이
		// m은 시행횟수
		int n = sc.nextInt();
		int[] Arr = new int[n];
		
		int m = sc.nextInt();
		
		for(int i=0; i<n; i++) {		// 1부터 n까지 1씩 증가하는 배열
			Arr[i] = i+1;
		}
		for(int j=0; j<m; j++) {		// m만큼 반복
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if((b-a)%2 ==0) {            // 뒤집을 배열이 짝수개일때
			for(int k = 0; k<(b-a)/2; k++) {
				int st = Arr[a+k-1];
				Arr[a+k-1] = Arr[b-k-1];
				Arr[b-k-1] = st;
			}
			}
			else {                        // 뒤집을 배열이 홀수개일때
				for(int k = 0; k<(b-a)/2+1; k++) { 
					int st = Arr[a+k-1];
					Arr[a+k-1] = Arr[b-k-1];
					Arr[b-k-1] = st;
			}
			}
		}
		for(int l=0; l<n; l++) {
			System.out.print(Arr[l]+" ");
		}
		}
}