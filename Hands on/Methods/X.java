class X{
public static void main(String[]args)
{
method1();
System.out.println("from main");
int value1=method2();
System.out.println(value1);
boolean value2=method3();
System.out.println(value2);
float value3=method4();
System.out.println(value3);
double value4=method5();
System.out.println(value4);
}
public static void method1()
{
System.out.println("from method1 void");
}
public static int method2()
{
System.out.println("from method2 int");
return 10;
}
public static boolean method3()
{
System.out.println("from method3");
return false;
}
public static float method4()
{
System.out.println("from method4");
return 10.0f;
}
public static double method5()
{
System.out.println("from method5");
return 10.20;
}
}
