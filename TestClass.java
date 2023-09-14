
public class TestClass {
int p;  //global variable varibale which isndefined class level
public int method1(int a, int b) //non static method
{
	int x=a;//local variable     variable which is defined inside the method 
	int y=b;
	int sum;
	sum=x+y;
	System.out.println(x);
	System.out.println(y);
	return sum;
}
public int method1(int a, int b,int c) //non static method and method overloading 
{
	int x=a;//local variable     variable which is defined inside the method 
	int y=b;
	int d=c;
	int sum1;
	sum1=x+y+c;
	System.out.println(x);
	System.out.println(y);
	System.out.println(c);
	return sum1;
}
public static String method2(int n, String m)// static method 
{
	int id;
	String name;
	id=n;
	name=m;
	String persondetails=n+m;
	System.out.println(persondetails);
	return persondetails;
}
	public static void main(String[] args) {
		TestClass.method2(10, "bindu");
		

	}

}
