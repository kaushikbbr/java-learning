class obj6{
	int i=1;
	void function(){
		i=i+1;
		System.out.println(i);
		System.out.println("End of function");
	}
	public static void  main(String args[]){
		obj6 o1 = new obj6();
		int x1 = 10;
		o1.i = 25;
		o1 = new obj6();
		System.out.println(o1.i);
		o1.i = 16;
		obj6 o2 = o1;
		System.out.println(o2.i);
	}
}
		