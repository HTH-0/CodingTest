// 길이가 n인 배열이 나온다. Arr1
// Arr1은 입력받은 값으로 정한다.
// 최댓값을 구한다. 그 값을 m이라고 한다.
// 각 숫자를 100/m으로 곱한 값을 가지는 Arr2를 만든다
// Arr2 배열의 평균을 구한다

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        float[] Arr1 = new float[n];       //  길이가 n인 배열
        
        for(int i=0; i<n; i++){
            Arr1[i] = sc.nextFloat();        // Arr1
        }
        
        float m = 0;
        for(int j=0; j<n; j++){            // m은 최댓값  
        	if(Arr1[j]>m ){
        		m = Arr1[j];
        	}
        }
        
        float [] Arr2 = new float[n];
        for(int l=0; l<n; l++){            // Arr2
        Arr2[l]= (Arr1[l]*100)/m;
        }
        
        float sum = 0;                    // Arr2값을 전부 더한다. 그걸 sum에 저장
        for(int o = 0; o<n; o++){
            sum = Arr2[o]+sum;
        }
        System.out.println(sum/n);    // Arr2의 평균값
    
    
    }
}