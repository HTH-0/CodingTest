// 배열이 짝수개일때
// 배열 길이/2 번만큼 확인

// 배열이 홀수개일때
// 배열 길이/2 번만큼 확인

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();	// 단어 입력받는다.
		
		// charAt() 를 사용해서 처음과 끝을 비교
		// 전체길이를 length() 를 사용
		int n = word.length();
		boolean check = false;
		for(int i=0; i<=n/2; i++) {
			if(word.charAt(i) != word.charAt(n-i-1)) {
				check = true;
			}
		}
		if (check == false) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	
	
	
	}
}