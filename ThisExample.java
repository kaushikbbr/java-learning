class ThisExample{
	ThisExample(){
		this(7);
		System.out.println("Inside empty constructor");
	}
	ThisExample(int i){
		this(i, i+1);
		System.out.println("Inside int i constructor");
	}
	ThisExample(int i, int j){
		System.out.println("Inside double int constructor");
	}
	public static void main(String args[]){
		ThisExample te = new ThisExample();
		System.out.println("End of main");
	}
}
