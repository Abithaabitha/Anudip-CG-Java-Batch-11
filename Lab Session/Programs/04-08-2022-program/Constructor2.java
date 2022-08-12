AUTHOR NAME:M.ABITHA
TITLE:WRITE THE PROGRAM CONSTRUCTOR USING ADD NAME,ADDRESS,LOCATION


public class Constructor2
{
    String company_name;
    String street_name;
    String place;
    int pin_code;
    String district;
    String country;
 
    public Constructor2(String company_name, String street_name,String place,int pin_code,String district,String country)
    {
        this.company_name =company_name;
        this.street_name = street_name;
        this.place=place;
        this.pin_code=pin_code;
        this.district=district;
        this.country=country;
    }
    public String getcompany_Name()
    {
        return company_name;
    }
    public String getstreet_name()
    {
        return street_name;
    }
    public String getplace()
    {
        return place;
    }
    public int getpin_code()
    {
        return pin_code;
    }
    public String getdistrict()
    {
        return district;
    }
    public String getcountry()
    {
        return country;
    }
    public static void main(String[] args)
    {
      Constructor2 obj = new Constructor2("Anudip","Ambetkar street ","Karapakkam",603110,"chennai","india");

      System.out.println(" company name is: "+obj.getcompany_Name());
      System.out.println(" street_name  is: "+obj.getstreet_name());
      System.out.println(" place is: "+obj.getplace());
      System.out.println(" pin_code: "+obj.getpin_code());
      System.out.println(" district is: "+obj.getdistrict());
      System.out.println(" country is: "+obj.getcountry());  
    }
}