import java.util.Scanner;

public class Subtract {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        int subtract = a-b;
        System.out.println(subtract);
    }
}