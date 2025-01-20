import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		// 길이를 입력받는다
		// 길이가 n인 트리
		// >> 1층 공백 n-1, 별 2-1
		// >> n층 공백 n-n, 별 2n-1
		// 2n-1층까지
		
		int n = sc.nextInt();	// 길이 입력받는다
		for(int i=1; i<=n; i++) {
			// i층일때 기준 
			int blank = n-i;		// 현재 층 기준으로 공백숫자
			int star = 2*i-1;		// 현재 층 기준으로 별 숫자
			// 공백이 blank만큼 출력
			for(int j = 0; j<blank; j++) {
				System.out.print(" ");
			}
			// 별이 star만큼 출력
			for(int k=0; k<star; k++) {
				System.out.print("*");
			}
		
		System.out.println();
		}						// 요기까지 정삼각형 모양
		
		for(int l=1; l<n; l++) {
			// 전체층 n 현재층 l층일때 기준
			// 공백은 l개
			// 별은 2n-2l-1
			
			int blank2 = l;
			int star2 = 2*n-2*l-1;
			
			for(int j = 0; j<blank2; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<star2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}
}