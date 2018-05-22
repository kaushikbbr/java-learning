class obj1{
	int i=0, j=0;
	void function1(){
		i=i+1;
		j=j+1;
		function2();
		System.out.println("Inside function 1");
	}
	void function2(){
		System.out.println(i);
		System.out.println(j);
		System.out.println("Inside function 2");
	}
	public static void main(String args[]){
		obj1 o = new obj1();
		o.function1();
		o.j = 115;
		System.out.println("End of main");
	}
}
		