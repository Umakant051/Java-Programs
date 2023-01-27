import java.util.Scanner;
public class exception {
	public static void main(String args[]){
		int a,b,result;
		System.out.println("Input for Integers:");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		try{
			result=a/b;
			System.out.println("Result="+result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception Caught:Division By Zero");
			
		}
	}

}
