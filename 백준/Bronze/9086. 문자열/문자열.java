// t번 입력받음
// 문자열의 첫글자와 마지막 글자만 출력
// 한글자라면 두번출력됨
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<t; i++){    
        String word = sc.nextLine();    
        
        int num = word.length();        //    입력받은 단어의 총 길이를 측정 > (숫자-1)이 마지막 문자열      
        char ch1 = word.charAt(0);            // ch1 첫번째 단어 
        char ch2 = word.charAt(num-1);        // ch2 마지막 단어
            
        System.out.printf("%c%c\n",ch1,ch2);
        
        
        }   
    }
}