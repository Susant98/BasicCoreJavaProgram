import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("enter number1 ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("enter a number2 ");
        Scanner sc1 = new Scanner(System.in);
        int n2 = sc1.nextInt();
        System.out.println("enter number3 ");
        Scanner sc2 = new Scanner(System.in);
        int n3 = sc2.nextInt();
        if((n1>n2) && (n1>n3)) {
            System.out.println("largest number is :" + n1 );
        } else if(n2>n3) {
            System.out.println("largest number is :" + n2);
        } else {
            System.out.println("largest number is :" + n3);
        }
    }
}
