class Sdemo2{
	String s1 = "abc";
	void function(){
		String s1 = "abc";
		if (s1 == this.s1)
			System.out.println("s1 and this.s1 are equal");
		else
			System.out.println("s1 and this.s1 are NOT equal");
	}
	public static void main(String args[]){
		Sdemo2 d = new Sdemo2();
		d.function();
		String s3 = "abc";
		if (s3 == d.s1)
			System.out.println("s1 and d.s1 are equal");
		else
			System.out.println("s1 and d.s1 are NOT equal");
		System.out.println("End of main()");
	}
}