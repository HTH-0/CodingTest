import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//길이가 6인 112228 배열과 입력받는 배열을 만든다.
		//두개를 뺀 값으로 만든 배열을 만든다.
		//배열을 출력한다.
		
		int[] Arr1 = new int[6];
		Arr1[0] = 1;
		Arr1[1] = 1;
		Arr1[2] = 2;
		Arr1[3] = 2;
		Arr1[4] = 2;
		Arr1[5] = 8;
		
		int[] Arr2 = new int[6];
		for(int i=0; i<6; i++) {	// 입력받는 배열
		Arr2[i] = sc.nextInt();		// 6회반복
		}	
		int[] Arr3 = new int[6];		// Arr3은 두 배열을 뺀 값으로 만듦
		for(int j=0; j<6; j++) {
		Arr3[j] = Arr1[j] - Arr2[j];
		}
		for(int k=0; k<6; k++) {
		System.out.print(Arr3[k]+" ");
		}
		
		
		sc.close();
	}
}