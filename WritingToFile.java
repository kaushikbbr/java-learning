import java.io.*;

class WritingToFile{
	public static void main(String args[]) throws IOException{
		FileWriter out = null;
		try{
			String path = "D:\\Temp\\";
			out = new FileWriter(path + "Test.html");
			out.write("<b><pre><font color=\"blue\"> Hello this is test doc <b></font>");
			out.close();
		}catch (Exception e){
			System.out.println(e);
		}
	}
}
			