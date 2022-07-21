class R
{


    public static void main(String[]hello){
        System.out.println("Hello java");
        
       
        if(10>100)
        {
           int i=20;
            System.out.println("from if");
        }
        else if(10<100)
        {
            if(true){
				
				
                System.out.println("From nested-if");
            }
            else
            {
                System.out.println("From Nested-else");
            }
            System.out.println("from else-if 1");
        }
        else if(false)
        {
            System.out.println("from else-if 2");
        }
        else if(false)
        {
            System.out.println("from else-if 3");
        }
        


    }
}