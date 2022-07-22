class Classlevel
{
static int i;
public static void main(String[]args)
{
Classlevel obj1 = new Classlevel();
System.out.println(obj1.i);
obj1.method1();
System.out.println(i);
method1();
}
public static void method1()
{
System.out.println("from static method");
}
}