import java.io.*;
class FileTester{
	public static void main(String[] args){
		String hm=System.getProperty("user.home");
		String fs=File.separator;
		String path=hm+fs+"fdir"+fs+"first.txt";
		File f=new File(path);
		//f.mkdir();
		try{
			//f.createNewFile();
			System.out.println("Readable: "+ f.canRead());
			System.out.println("writtable: "+f.canWrite());
			System.out.println("executable: "+f.canExecute());
		}catch(Exception e){
			e.printStackTrace();
		}
//		f.mkdirs();
		//System.out.println(hm+"   "+fs);
	}
}
