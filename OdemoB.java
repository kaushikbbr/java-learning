class OdemoB{
	int i,j;
	void function1(int i){
		System.out.println(i);
		System.out.println("Inside function1()");
	}
	void function2(A a1){
		if (a1 != null){
			a1.i = 23;
			a1.j = 15;
		}
		System.out.println(a1);
		System.out.println("end of function2");
	}
	public static void main(String args[]){
		OdemoB d1 = new OdemoB();
		A a2 = new A();
		d1.function2(a2);
		System.out.println(a2.i);
		System.out.println("End Main");
	}
}
