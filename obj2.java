class obj2{
	int i=0, j=0;
	void function1(){
		int i=0;
		i=25;
		j=35;
		System.out.println("Inside function 1");
		System.out.println(i);
		System.out.println(j);
		System.out.println("End of function");
	}
	public static void main(String args[]){
		obj2 o = new obj2();
		o.function1();
		System.out.println(o.i);
		System.out.println(o.j);
	}
}
		