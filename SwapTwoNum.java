import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
	  int num1,num2,temp;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number1:");
	  num1=sc.nextInt();
	  System.out.println("enter the number2:");
	  num2=sc.nextInt();
	  temp=num1;
	  num1=num2;
	  num2=temp;
	  System.out.println("num1="+num1);
	  System.out.println("num2="+num2);
   sc.close();
	}

}
