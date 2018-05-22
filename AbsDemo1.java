abstract class Abs1{
	Abs1(){
		System.out.println("This is constructor in abstract class");
	}
	
	public abstract void function1();
	void function2(){
		System.out.println("Inside function2 of abstract class");
	}
}

class AbsDemo1 extends Abs1{
	public void function1(){
		System.out.println("Inside abstract function definition in the class extending the abstract class");
	}
	public void functionD(){
		System.out.println("Inside some method just like that");
	}
	
	public static void main(String args[]){
		AbsDemo1 ad1 = new AbsDemo1();
		ad1.function1();
		ad1.functionD();
		ad1.function2();
		System.out.println("");
		System.out.println("");
		Abs1 ad2 = new AbsDemo1();
		ad2.function1();
		ad2.function2();
	}
}

