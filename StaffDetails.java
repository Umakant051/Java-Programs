import java.util.Scanner;
class Staff{
	String staffid,name,phone,salary;
	Scanner input=new Scanner(System.in);
	void read(){
		System.out.println("Enter StaffID:");
		staffid=input.nextLine();
		System.out.println("Enter Name:");
		name=input.nextLine();	
		System.out.println("Enter Phone:");
		phone=input.nextLine();
		System.out.println("Enter Salary:");
		salary=input.nextLine();
               }
	void display(){
		System.out.printf("\n%-15s","STAFFID");
		System.out.printf("%-15s\n",staffid);
		System.out.printf("\n%-15s","NAME");
		System.out.printf("\n%-15s",name);
		System.out.printf("\n%-15s","PHONE");
		System.out.printf("\n%-15s",phone);
		System.out.printf("\n%-15s","SALARY");
		System.out.printf("\n%-15s",salary);
		}
}
	class Teaching extends Staff{
		
		    String Domain,Publication;
	void read_teaching(){
			super.read();
        System.out.println("Enter the Domain:");
		Domain=input.nextLine();
		System.out.println("Enter the Publication:");
		Publication=input.nextLine();
		}
	void display(){
		System.out.printf("\n%-15s","DOMAIN");
		System.out.printf("%-15s\n",Domain);
		System.out.printf("\n%-15s","PUBLICATION");
		System.out.printf("%-15s\n",Publication);
 	}
 }
	class Technical extends Staff{
		String Skills;
		void read_technical(){
			super.read();
			System.out.println("Enter Skills:");
			Skills=input.nextLine();
		}
		void display(){
			System.out.printf("\n%-15s","SKILLS");
			System.out.printf("%-15s\n",Skills);
			}
	}
	
	class Contract extends Staff{
		String Period;
		void read_contract(){
			super.read();
			System.out.println("Enter Period");
			Period=input.nextLine();
			System.out.printf("\n%-15s","PERIOD");
			System.out.printf("%-15s\n",Period);
			}
	}
	
	
public class StaffDetails {
      public static void main(String args[]){
    	  Scanner input=new Scanner(System.in);
    	  System.out.println("---STAFF DETAILS---");
    	  System.out.println(" ");
    	  System.out.println("Enter the number of staff details to be created:");
          int n=input.nextInt();
          Teaching steach[]=new Teaching[n];
          Technical stech[]=new Technical[n];
          Contract scon[]=new Contract[n];
          for(int i=0;i<n;i++){
        	  System.out.println("Enter Teaching Staff Information:");
        	  steach[i]=new Teaching();
        	  steach[i].read_teaching();
        	 }
          for(int i=0;i<n;i++){
        	  System.out.println("Enter Technical Staff Information:");
        	  stech[i]=new Technical();
        	  stech[i].read_technical();
        	 }
          for(int i=0;i<n;i++){
        	  System.out.println("Enter Contract Staff Details");
        	  scon[i]=new Contract();
        	  scon[i].read_contract();
        	 }
          
      //Display
      
    	  System.out.println("--Teaching Staff Details--");
    	  for(int i=0;i<n;i++){
    		  steach[i].display();
    	  }
    	  System.out.println("");
    	  System.out.println("--Technical Staff Details--");
    	  for(int i=0;i<n;i++){
    		  stech[i].display();
    	  }
    	  System.out.println("");
    	  System.out.println("--Contract Staff Details--");
    	  for(int i=0;i<n;i++){
    		  scon[i].display();
    	  }
    	  input.close();
      }
}

    	  
    	  
