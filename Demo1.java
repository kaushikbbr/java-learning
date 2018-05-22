class Demo1{
	int x = 0;
	void func(){
		x=10;
		Demo1 d = new Demo1();
		d.x = 115;
		System.out.println(d.x);
		System.out.println(x);
		System.out.println("End of functionD()");
	}
	public static void main(String args[]){
		Demo1 d = new Demo1();
		d.func();
		System.out.println(d.x);
	}
}
		