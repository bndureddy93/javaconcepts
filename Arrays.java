import java.util.Arrays;
public class Arrays {

	public Arrays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num[] ={10,20};
String name[]=new String[3];
name[0]="Bindu";
name[1]="Sudheer";
name[2]="Nirvana";
//name[3]="xyz";//Arrayindexoutofbounds exception becuase if try to give input more than array size
for(String Person:name)
{
	System.out.println(Person);
	
}
Arrays.sort(name);
Arrays.equal(Person,name);
Arrays.toList();
System.out.println(name.length);

System.out.println(num);
int[] number1= {1,2,3};
int[] number2= {5,6,7};
int[] number3= {1,2,3};
System.out.println(Arrays.equals(number1));

	}

}
