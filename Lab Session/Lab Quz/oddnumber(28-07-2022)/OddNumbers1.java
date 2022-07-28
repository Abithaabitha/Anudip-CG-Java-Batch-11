import java.util.Scanner;  
class OddNumbers1
{  
   public static void main(String[] args)   
   {  
    int number,i;  
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the limit: ");  
    number = sc.nextInt();    
    i=1; 
    System.out.print("List of odd numbers: ");  

    while(i<=number)  
    {  
 
    System.out.print(i +" ");    
    i=i+2;  
    }     
    }  
}  