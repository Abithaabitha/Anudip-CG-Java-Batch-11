abstract class person
{
	String name1;
	String address_name1;
	int Id_number1;
	

person(){
}
person(String name1 ,String address_name1,int Id_number1)
{
	this.name1=name1;
	this.address_name1=address_name1;
	this.Id_number1=Id_number1;
}

}
	
 class salary extends person{
	 salary(){
}
	
	salary(String name1,String address_name1,int Id_number1 )
	{
		this.name1=name1;
		this.address_name1=address_name1;
		this.Id_number1=Id_number1;
	}
	
       public void name1(){
		  System.out.println("First emplyee details:");
		  System.out.println("*********************");
          System.out.println("The  Employee name1 is:"+name1);
		  System.out.println("The  address1 is:"+address_name1);
		  System.out.println("The  ID number1 is:"+Id_number1);
		  
       }
}
class employee extends salary{
	
	 employee(){
}
	String name2;
	String address_name2;
	int Id_number2;
	
    employee(String name2,String address_name2,int Id_number2 )
	{
    
		this.name2=name2;
		this.address_name2=address_name2;
		this.Id_number2=Id_number2;
		
	}
	
	
       public void name2(){
		  System.out.println("Second emplyee details:");
		  System.out.println("**********************");
          System.out.println("The Employee name2 is:"+name2);
		  System.out.println("The   address2 is:"+address_name2);
		  System.out.println("The  ID number2 is:"+Id_number2);
		  
        }
}

class workers extends employee{
	
	 workers(){
}
	String name3;
	String address_name3;
	int Id_number3;
	
    workers(String name3,String address_name3,int Id_number3)
	{
    
		this.name3=name3;
		this.address_name3=address_name3;
		this.Id_number3=Id_number3;
		
	}
	
	
       public void name3(){
		  System.out.println("Third emplyee details:");
		  System.out.println("**********************");
          System.out.println("The Employee name3 is:"+name3);
		  System.out.println("The   address3 is:"+address_name3);
		  System.out.println("The  ID number3 is:"+Id_number3);
		  
        }
}		
public class Anudip1		
		
{
public static void main(String[]args){

 salary obj = new salary("Sneha", "kandipan street",105);
 employee obj1=new employee("Selvi","Ambetkar street",204);
 workers obj2=new workers("Abitha","kandhi street",120);
 
 obj.name1();
 obj1.name2();
 obj2.name3();
}
}
