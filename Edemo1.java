class A{
	void functionA(){
		System.out.println("Inside Funcrion A");
	}
}

public class Edemo1{
	public static void main (String args[]){
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		int l = Integer.parseInt(args[3]);
		A a = null;
		try{
			System.out.println("Inside try block");
			int x = i/j;
			System.out.println(x);
			int ar[] = new int[k];
			ar[l] = x;
			if (x>10)
				a = new A();
			a.functionA();
		}
		catch(ArithmeticException e1){
			System.out.println(e1);
		}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println(e2);
		}
		catch(NullPointerException e3){
			System.out.println(e3);
		}
	}
}
