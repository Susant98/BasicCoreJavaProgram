package Flip;
import java.util.*;
public class Flipcoin {
	  public static void main(String[] args) {
          System.out.println("enter total number of time you want to flip a coin");
	Scanner sc = new Scanner(System.in);
	int count = sc.nextInt();
	double  flipcoin;
	double head = 0;
	double tail = 0;
	for(int i=1;i<=count;i++) {
		flipcoin = Math.random();
		if(flipcoin < 0.5) {
			tail++;
		} else {
			head++;
		}
	}
	double headpercent = (head / (double)count) * 100;
	double tailpercent = (tail / (double)count) * 100;
          System.out.println("total number of head " + head);
          System.out.println("total number of tail " + tail);
          System.out.println("head percentage" + headpercent);
          System.out.println("tail percentage" + tailpercent);
}

}
