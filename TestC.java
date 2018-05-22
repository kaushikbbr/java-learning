class OdemoC{
	int i,j;
	int function1(int i){
		int j=0;
		j=i*i;
		return(j);
	}
}
class TestC{
	public static void main(String args[]){
		OdemoC d1 = new OdemoC();
		d1.function1(9);
		int x = d1.function1(4);
		System.out.println(x);
		// System.out.println(d.function1(4));
		//System.out.println(x+4);
		// System.out.println(d.function1(4)+6);
	}
}

	