import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력 받을 숫자의 개수
        int sosu = 0; // 소수의 개수를 저장할 변수

        for (int i = 0; i < n; i++) { // n번 반복하여 숫자 입력 받기
            int a = sc.nextInt(); // 각 숫자 a를 입력받음

            if (a == 1) {
                // 1은 소수가 아니므로 아무 작업도 하지 않음
            } else {
                int check = 0; // 약수의 개수를 셀 변수

                // 1부터 a-1까지 나누어보기
                for (int j = 1; j <= a; j++) {
                    if (a % j == 0) { // j로 a가 나누어지면
                        check++; // check를 증가시켜서 약수의 개수를 셈
                    }
                }

                // 약수가 2개(1과 자기 자신만 있을 때)라면 소수
                if (check == 2) {
                    sosu++;
                }
            }
        }

        // 소수의 개수를 출력
        System.out.println(sosu);
    }
}