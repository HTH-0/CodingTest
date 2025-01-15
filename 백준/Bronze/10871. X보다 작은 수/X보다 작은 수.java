import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		// 정수 n개로 이루어진 수열 a, 정수x가 주어짐
		// 수열 a 에서 x보다 작은 값 출력
		
		// 정수 n을 입력받는다
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// n개로 이루어진 수열 a 
		int[] Arr = new int [n];
		
		// x를 입력받는다
		int x = sc.nextInt();
		
		// 수열에 넣을 n개의 정수값을 받는다
		for(int i=0; i<Arr.length; i++) {
			Arr[i] = sc.nextInt();
		}
		// x 보다 작은 수열들을 찾는다
		for(int j = 0; j<n; j++) {        // Arr[0] 부터 Arr[n-1]까지 
		if(Arr[j]<x) {            // j번째 수열이 x값보다 작다면
			System.out.print(Arr[j]+" ");        // 출력
		}
		}
	
	}
}