import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        if(H>= 1) {
        if(M>=45){
            System.out.println(H);
            System.out.print(M-45);
        }
        else if(M<45){
            System.out.println(H-1);
            System.out.print(M+15);
        }
        }
        else if(H<1) {
        	if(M>=45){
                System.out.println(H);
                System.out.print(M-45);
            }
            else if(M<45){
                System.out.println(23);
                System.out.print(M+15);
            }
        }
    }
}