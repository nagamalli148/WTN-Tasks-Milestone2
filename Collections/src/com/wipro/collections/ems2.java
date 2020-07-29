package com.wipro.collections;
import java.util.Scanner;

class employee
{
	String[][] emp=new String[100][4];   // I am creating 2D string array to use it as a file to hold all employee details
	 int i=0;
	void addemployee(int id,String name,int age,double salary)   // method to add employee details
	{
		
		emp[i][0]=String.valueOf(id);
		emp[i][1]=name;
		emp[i][2]=String.valueOf(age);
		emp[i][3]=String.valueOf(salary);
		i++;	   // after every time adding details we are incrementing i to store next employee details
		
	}
	void display()   // method to display employee details
	{
		int x=0;
		System.out.println("----Report----");
		    for(x=0;x<i;x++)     // for loop to iterate and display all employees details                  
	               System.out.println(emp[x][0] +"\t" +emp[x][1] +"\t" +emp[x][2] +"\t" +emp[x][3]);
		System.out.println("----End of Report----");
	}
	
	
}

public class ems2  {

	public static void main(String[] args) {
		employee e=new employee();
		boolean b=true;
		while(b) // Since it is a continous process we are using while with true condition
                {
		System.out.println("Main Menu");
		System.out.println("1. Add an Employee");
		System.out.println("2. Display All");
		System.out.println("3. Exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:  // to add employee details
		{
			try {   
			System.out.println("Enter Employee ID :");
			int id=sc.nextInt();                         //Employee Id
			System.out.println("Enter Employee Name :");
			String name=sc.next();                       //Employee name
			String padded = String.format("%-15s", name); // pading name to length 10 string
			System.out.println("Enter Employee Age :");
			int age=sc.nextInt();                        //Employee Age
			System.out.println("Enter Employee Salary :");
			double salary=sc.nextDouble();               //Employee Salary
			e.addemployee(id,padded,age,salary); 
			break;
                        }
			catch(Exception ex)  // We are using exceptions incase if the entered format is not valid 
			{
				System.out.println();
				System.out.println("Please enter in a valid format");
				System.out.println();
			}

		}
		case 2:
		{
			e.display();
			break;
		}
		case 3:
		{
			System.out.println("Exiting the System");
			b=false;  // to come out of the loop
		}
		}
  }
	}
}
