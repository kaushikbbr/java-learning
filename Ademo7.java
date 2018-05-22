class Ademo7{
	int[] getArray(int i){
		int j[] = new int[i];
		for(int k=0; k<i; k++)
			j[k] = k*k;
		return (j);
	}
	
	void function1(int i[]){
		if(i != null && i.length>0){
			System.out.println("Length : " + i.length);
			System.out.println(i[i.length-1]);
		}else
			System.out.println("Improper value passed");
	}
	
	public static void main(String args[]){
		Ademo7 a7 = new Ademo7();
		int i[] = a7.getArray(7);
		for(int k=0; k<i.length; k++)
			System.out.println(i[k]);
		a7.function1(new int[7]);
		a7.function1(null);
		int z[] = {1,2,3};
		a7.function1(z);
	}
}
		