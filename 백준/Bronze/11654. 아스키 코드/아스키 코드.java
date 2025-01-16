import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String code = sc.nextLine();
        char ascii = code.charAt(0);
        System.out.println((int)ascii);
        
    }
}