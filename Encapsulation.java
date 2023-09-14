
public class Encapsulation {
private String name;

public String getname()
{
	return name;
}
public    void setname(String newname)
{
	this.name=newname;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Encapsulation e=new Encapsulation();
		e.name="bindu";
		//System.out.println(e.name);
		e.getname();
	}

}
