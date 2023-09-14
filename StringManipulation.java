import java.lang.*;
public class StringManipulation {

	public StringManipulation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Bindu";
String str2="Sudheer";
String str3="Bindu";
String str4=new String("Bindu");
System.out.println(str1.equals(str2));
System.out.println(str1.equals(str3));
System.out.println(str1==str2);
System.out.println(str1==str3);
System.out.println(str1==str4);
str1.concat("Nirvana");//strings are immutale old value will not change 
System.out.println(str1);
System.out.println(str1.concat("Nirvana"));
System.out.println(str1);
System.out.println(str1.charAt(0));
//System.out.println(str1.charAt(5));//StringIndexoutof bounds exception
System.out.println(str1.length());
System.out.println(str2.substring(2));
System.out.println(str2.substring(2, 5));
System.out.println(str2.replace("Sudheer", "Kumar"));
	}

}
