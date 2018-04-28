import java.util.Scanner;
public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double n = 2.5;
System.out.println(2 * (5 / 2 + 5 / 2));
n+= n ;
System.out.println(n);
System.out.print("weight:");

double weiht= input.nextDouble();
System.out.print("height:");
double height= input.nextDouble();
double bmi=weiht/(height*height);
System.out.print("bmi="+bmi);
	}

}
