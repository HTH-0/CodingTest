import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String word = sc.nextLine();
        int i = word.length();            // 문자열의 길이를 반환한다
        
        System.out.println(i);
    }
}