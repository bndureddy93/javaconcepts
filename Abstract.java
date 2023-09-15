
abstract class Bank {

	abstract int getrateofinterest();
	class SBI extends Bank{

		@Override
		int getrateofinterest() {
			// TODO Auto-generated method stub
			return 14;
		}
		
		class BOFA extends Bank{

			@Override
			int getrateofinterest() {
				// TODO Auto-generated method stub
				return 10;
			}
			
		}
	}
}
class TestClass{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//TestClass t1=new TestClass();
		Bank b;
		b=new SBI();
		System.out.println(b.getrateofintreset());
		b=new BOFA();
		System.out.printn(b.getrateofinterest();
		System.out.printn(b.getrateofinterest();
		
	}

}

