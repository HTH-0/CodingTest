import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        String num = sc.next(); // 공백 없이 붙어 있는 숫자 문자열 입력

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num.charAt(i) - '0'; // 문자 -> 숫자로 변환하여 더함
        }

        System.out.println(sum);
        sc.close();
    }
}