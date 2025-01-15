import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		// 정수 n 입력받는다
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] Arr = new int[n];		// 길이가 n인 배열
		for(int i=0; i<n; i++) {
			Arr[i] = sc.nextInt();	// Arr[0]부터 Arr[n-1]까지 수열 입력받기
			
		}
		int x = Arr[0];					// 임의의 수열값 x
		int y = Arr[0];					// 임의의 수열값 y 
		for(int j=0; j<n; j++) {		// n번만큼 반복
		if(x>Arr[j]) {				// 	x라는 수열값이 모든 수열 값보다 작다
			x = Arr[j];
		}
		if(y<Arr[j]) {				//	y라는 수열값이 모든 수열 값보다 크다
			y = Arr[j];
		}
		}
		System.out.print(x);
		System.out.print(" "+y);
		
		
		sc.close();
	}
}