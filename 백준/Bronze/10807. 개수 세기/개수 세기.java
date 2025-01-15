import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	// 스캐너 사용
		
		int n = sc.nextInt();		// n을 입력받는다
		int[] nArr = new int[n];		// n개의 정수가 주어진다.
		
		for(int i=0; i<nArr.length; i++) { 	//n개의 입력받은 수의 배열
			nArr[i] = sc.nextInt();			// n개만큼 임의의 숫자를 입력받는다.
			
		}
		int v = sc.nextInt();				// v라는 숫자를 입력받는다
		int amount = 0; 					// 중복숫자를 저장할 변수 지정
		for(int j=0; j<n; j++) {			// nArr[0] ~ nArr[n] 중에 v 값과 같은 값만큼 센다
			if(nArr[j]==v) {
				amount++;
			}
		}
		System.out.println(amount);			// 세어진 값 출력
		
		
	}
}
