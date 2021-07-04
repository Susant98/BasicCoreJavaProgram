import java.util.Scanner;

public class LeapYear
{
    public static void main(String args[])
    {
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Year : ");
        year = scan.nextInt();

        if((year % 4)==0 || (year % 100)==0 || (year % 400)==0){
            System.out.println("it is a leap year : " + year);
        }
        else{
            System.out.println("it is not a leap year : " + year);
        }
    }
}
