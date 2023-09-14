import java.util.ArrayList;

public class Arraylist {

	public Arraylist() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("bindu");
	list.add("Sudheer");
	list.add("Myra");
	//if want to insert in middle of elements
	list.add(1,"nirvana");//it will insert after first element 
	list.add(2,"chittireddy");
			
		System.out.println(list.size());
	//want to remove elements in arry
	list.remove("bindu");
	list.remove("chittireddy");
			
System.out.println("elements in array list are:"+list);

	}

}
