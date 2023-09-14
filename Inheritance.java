
public class Inheritance extends ClassA{

	int a=10;
	void m1()
	{
		System.out.println("m1 method");
	}
	void run()//overridding this means we xtend class A but Class A also have same method run
	{
		System.out.println("inheritance method run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inheritance i1=new Inheritance();
		ClassA c1=new ClassA();
		System.out.println(c1.sal);
		//i1.m1();
		//i1.run();

	}

}
