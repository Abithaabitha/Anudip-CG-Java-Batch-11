class Cricket
{
  int JecyNo;
  String CricketerName;
  Cricket(int JecyNo){
    this.JecyNo = JecyNo;
   }
 
   Cricket(int JecyNo,String CricketerName){
     this.JecyNo=JecyNo;
     this.CricketerName=CricketerName;
   }
}


public class Constructor1
{
   public static void main(String[]args){
    
     Cricket obj=new Cricket(18);
     Cricket obj1=new Cricket(18,"ViratKholi"); 
     Cricket obj2=new Cricket(07,"Dhoni"); 
     System.out.println(obj.JecyNo);
     System.out.println(obj1.CricketerName);
     System.out.println(obj2.JecyNo);
     System.out.println(obj2.CricketerName);
    }
}

     