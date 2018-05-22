class X{
	int i=0;
	void func(){
		i=i+1;
		i=i*i;
	}
	public static void  main(String args[]){
		X x1=new X();
		x1.i=2;
		x1.func();
		System.out.println(x1.i);
	}
}

		
