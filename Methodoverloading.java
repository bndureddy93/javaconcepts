
public class Methodoverloading {

	int a;
	int b;
	double c;
	public void sum()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public void sum(int a,int b)//we use this varibales when we are taking input paramenter variables same as class vasible name to avoid confinsion we use this keyword represent class variable
	{
		this.a=a;
		this.b=b;
		
	}
	public void sum(int m, double n)//here we are taking different intpu paraments and assign to class variable so we are not usind this keyword
	{
		a=m;
		c=n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading m1=new Methodoverloading();
		m1.sum(10, 30.5);
		m1.sum(30, 50);
	}

}
