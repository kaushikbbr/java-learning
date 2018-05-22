class ParamConstruc{
	ParamConstruc(int p){
		System.out.println("Inside int param construc");
	}
	ParamConstruc(int p, float c){
		System.out.println("Inside int, float param construc");
	}
	public static void main(String args[]){
		ParamConstruc pc = new ParamConstruc(7);
		ParamConstruc pc2 = new ParamConstruc(7, 2.5f);
		//ParamConstruc pc3 = new ParamConstruc();
		
	}
}
	