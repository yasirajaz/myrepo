import java.io.*;
class FileTEster{
	public static void main(String[] args){
		try{
			File f=new File("./mynewdir");
			f.mkdir();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
