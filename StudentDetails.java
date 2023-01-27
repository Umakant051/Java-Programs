import java.util.Scanner;
class Student{
	String USN,Name,Branch,Phone;
	Scanner input=new Scanner(System.in);
void read(){
	System.out.println("Enter USN:");
	USN=input.nextLine();
	System.out.println("Enter Name:");
	Name=input.nextLine();
	System.out.println("Enter Branch:");
	Branch=input.nextLine();
	System.out.println("Enter Phone:");
	Phone=input.nextLine();
}
void display(){
  System.out.printf("%-20s %-20s %-20s %-20s",USN,Name,Branch,Phone);
}
}
public class StudentDetails {
	public static void main(String args[]){
	  Scanner input=new Scanner(System.in);
	  System.out.println("--Student details Entry Program--");
	  System.out.println("");
	  System.out.println("Enter the number of student details to be created:");
	  int number=input.nextInt();
	  Student s[]=new Student[number];
	  //read the student information
	  for(int i=0;i<number;i++){
		  System.out.println("Enter Student"+(i+1)+"details");
	  System.out.println("---------\n");
	  s[i]=new Student();
	  s[i].read();
	 }
//display the student information
	  System.out.printf("%-20s %-20s %-20s %-20s","USN","NAME","BRANCH","PHONE");
  for(int i=0;i<number;i++){
	  System.out.println();
	  s[i].display();
  }
  input.close();
 } 
}