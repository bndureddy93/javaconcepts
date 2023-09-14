
public class Constructoroverloading {
	int a;
	int b;
	double c;

	public Constructoroverloading() {
		
	}
	public Constructoroverloading(int x, int y)
	{
		a=x;
		b=y;
	}
	public Constructoroverloading(int a,double c)
	{
		this.a=a;
		this.c=c;
		
	}
	public static void main(String[] args) {
		Constructoroverloading c1=new Constructoroverloading(10,20);
		Constructoroverloading c2=new Constructoroverloading(20,40.5);
}
}
