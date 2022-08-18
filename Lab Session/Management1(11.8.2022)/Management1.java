
Author Name:M.Abitha
Title: write the program different class in inheritance


class College
{
	College()
	{
		System.out.println("From VIIT college");
	}
	int D_Id;
	int C_Id;
	int S_Id;
	College(int D_Id ,int C_Id ,int S_Id)
	{
		this.D_Id = D_Id;
		this.C_Id = C_Id;
		this.S_Id = S_Id;
	}
}
class Department extends College
{
	int D_number;
	String D_name;
	String C_name;
	String P_name;
	Department(int D_number , String D_name , String C_name , String P_name)
	{
		this.D_number = D_number;
		this.D_name = D_name;
		this. C_name = C_name;
		this. P_name = P_name;
	}
	String D1_name;
	int D2_number;
	String P1_name;
	String C1_name;
	Department(String D1_name , int D2_number , String P1_name , String C1_name)
	{ 
	    this.D1_name = D1_name;
		this.D2_number = D2_number;
		this.P1_name = P1_name;
		this.C1_name = C1_name;
	}
	String P2_name;
	String D3_name;
	int D4_number;
	String C2_name;
	Department(String P2_name , String D3_name ,int D4_number , String C2_name)
	{ 
	    this.P2_name = P2_name;
		this.D3_name = D3_name;
		this.D4_number = D4_number;
		this.C2_name = C2_name;
	}
	String P3_name;
	String D5_name;
	String C3_name;
	int D6_number;
	
	Department(String P3_name , String D5_name, String C3_name , int D6_number)
	{ 
	    this.P3_name = P3_name;
		this.D5_name = D5_name;
		this.C3_name = C3_name;
		this.D6_number = D6_number;
		
	}
}
	public class Management1
	{
		public static void main(String[]args)
		 {
			 College obj = new College(04,04,04);
			 Department obj1 = new Department(1,"EEE" , "EMBEDED SYSTEM", "Lakshmipriya");
			 Department obj2 = new Department("ECE",2 , "Yasha wini", "LINER INTEGRATED CIRCUIT");
			 Department obj3 = new Department("Praveen","Mech", 3, "FLUID MECHANICS");
			 Department obj4 = new Department("Viji","CSE", "PYTHON", 4);
			 System.out.println("---------");
			 System.out.println("Number of Department");
			 System.out.println("****************");
			 System.out.println("Number of Department=" + obj.D_Id);
			 System.out.println("Number of Course is=" + obj.C_Id);
			 System.out.println("Number of Proffoser is=" + obj.S_Id);
			 System.out.println("--------");
			 System.out.println("First Department");
			 System.out.println("*****************");
			 System.out.println("Department Number is="+ obj1.D_number);
			 System.out.println("Department Name is="+ obj1.D_name);
			 System.out.println("Course name is="+ obj1.C_name);
			 System.out.println("Proffoser name is="+ obj1.P_name);
			 System.out.println("---------");
			 System.out.println("Second Department");
			 System.out.println("****************");
			 System.out.println("Department Name is="+ obj2.D1_name);
			 System.out.println("Department Number is="+ obj2.D2_number);
			 System.out.println("Course name is="+ obj2.P1_name);
			 System.out.println("Proffoser name is="+ obj2.C1_name);
			 System.out.println("Third Department");
			 System.out.println("****************");
			 System.out.println("Proffoser Name is="+ obj3.P2_name);
			 System.out.println("Department Name is="+ obj3.D3_name);
			 System.out.println("Department number is="+ obj3.D4_number);
			 System.out.println("Course name is="+ obj3.C2_name);
			 System.out.println("Fourth Department");
			 System.out.println("****************");
			 System.out.println("Proffoser Name is="+ obj4.P3_name);
			 System.out.println("Department Name is="+ obj4.D5_name);
			 System.out.println("Course name is="+ obj4.C3_name);
			 System.out.println("Department number is="+ obj4.D6_number);
			 
			 
			 System.out.println("---------");
		 }
	}
	
