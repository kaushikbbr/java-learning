class obj3{
	int j=1;
	void fun1(){
		j=j+1;
		X x1 = new X();
		x1.i = 15;
		System.out.println(x1.i);
	}
	public static void main(String args[]){
		obj3 o = new obj3();
		o.fun1();
		X x1 = new X();
		System.out.println(x1.i);
	}
}
