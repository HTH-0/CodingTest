import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
       Scanner sc = new Scanner(System.in);
 
       // 30개의 1~30까지 올라가는 수열을 만든다
       // 입력된 값과 수열이 일치하면 일정한 숫자를 더한다 ex) 1000
       // 특정 숫자보다 작은 수열 값만 출력
       
       int[] Arr = new int[30]; //30줄
       for(int i=0; i<30; i++) {		// 1~30까지 수열
    	   Arr[i] = i+1;
       }
       
       for(int j=0; j<28; j++) {				// 28번 반복함
       int a = sc.nextInt();			// 28번 입력받음
       
       for(int l=0; l<30; l++) {
       if(Arr[l]==a) {					// 특정 수열값이 입력받은 값과 같다면
    	   Arr[l]=Arr[l]+1000;			// 높은 수 더함
       	}
       }
       
       }
       
       for(int k=0; k<30; k++) {			// 전부 반복
       if(Arr[k]<1000) {						// 1000보다 작은수를 출력
        	   System.out.println(Arr[k]);	
           }
       
       }
    }
}