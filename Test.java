class OdemoA{
	int i,j;
	void function(int i){
		i=i+1;
		j=i+1;
		System.out.println(i);
		System.out.println(j);
	}
}
class Test{
	public static void main(String args[]){
		OdemoA d1 = new OdemoA();
		d1.function(7);
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}
