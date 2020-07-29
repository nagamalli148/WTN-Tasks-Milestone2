package com.wipro.collections;

// User defined exception for the Invalid Exception id
class InvalidEmployeeIDException extends Exception
{
	InvalidEmployeeIDException(String s)
	{
		super(s);
	}
}

public class Project1
{

//Initialization of Employee details 
	
	
	//Designations Table
	private static String[][] daTable = new String[][] {
		{"e", "Engineer", "20000"},
		{"c", "Consultant", "32000"},
		{"k", "Clerk", "12000"},
		{"r", "Receptionist", "15000"},
		{"m", "Manager", "40000"}
	};
	
	//Employee details
	private static String[][] empTable = new String[][] {
		{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
		{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
		{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
		{"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
		{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
		{"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
		{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
	};
	
	
// Methods for accessing the details of the designation
	
	// Method to get the Designation based on the designation code
	static String getDesignation(String a)
	{
		switch(a)
		{
		case "e":return (daTable[0][1]);
		case "c":return (daTable[1][1]);
		case "k":return (daTable[2][1]);
		case "r":return (daTable[3][1]);
		case "m":return (daTable[4][1]);
		}
		return "";
	}

	//Method to get the Dear Allowance(DA) based on the designation code
	static int getDA(String e)
	{
		switch(e)
		{
		case "e":return Integer.parseInt(daTable[0][2]);
		case "c":return Integer.parseInt(daTable[1][2]);
		case "k":return Integer.parseInt(daTable[2][2]);
		case "r":return Integer.parseInt(daTable[3][2]);
		case "m":return Integer.parseInt(daTable[4][2]);
		}
		return 0;
	}

//Methods for accessing the Employee details
	
	// Method to get the Salary from the index
	static int calculateSalary(int basic, int hr, int it, int da)
	{
		return (basic + hr + da - it);
	}

	
	static void printDetails(int emp_id) throws InvalidEmployeeIDException
	{
		int i, salary;
		String emp_name, des_code, dep, des;
		for(i=0;i<empTable.length;i++)
		{
			if(emp_id==Integer.parseInt(empTable[i][0]))
			{
				emp_name=empTable[i][1];
				des_code=empTable[i][3];
				dep=empTable[i][4];
				des=getDesignation(des_code);
				salary=calculateSalary(Integer.parseInt(empTable[i][5]), Integer.parseInt(empTable[i][6]), Integer.parseInt(empTable[i][7]), getDA(des_code));
					
				
				//%10s-format with specified no.of characters and right justify
				//%-10s-format with specified no.of characters and left justify
				System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp No", "Emp Name", "Department", "Designation", "Salary");
				System.out.printf("%-10s%-10s%-15s%-15s%-10s", emp_id, emp_name, dep, des, salary);
				return;
			}
		}
		throw new InvalidEmployeeIDException("There is no employee with empid : "+emp_id);
	}
	public static void main(String[] args) 
	{
		try
		{
			printDetails(Integer.parseInt(args[0]));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
