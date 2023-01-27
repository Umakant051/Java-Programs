import java.util.Scanner;
public class Quadratic {
  public static void main(String args[]){
	  System.out.println("Enter the coefficients of a,b and c:");
	  Scanner input=new Scanner(System.in);
	  float a=input.nextFloat();
	  float b=input.nextFloat();
	  float c=input.nextFloat();
	  double d=b*b-4*a*c;
	  if(d==0){
		  System.out.println("The Roots are Real and Equal");
		  double r1,r2;
		  r1=-b/(2*a);
		  r2=r1;
		  System.out.println("The Roots are"+r1+"and"+r2);
	  }
	  else if(d>0){
		  System.out.println("The Roots are Real and Distinct");
		  double r1=(-b+Math.sqrt(d))/(2*a);
		  double r2=(-b-Math.sqrt(d))/(2*a);
		  System.out.println("The Roots are"+r1+"and"+r2);
	  }
	  else{
		  System.out.println("Roots are not Real");
	  }
  }
}
