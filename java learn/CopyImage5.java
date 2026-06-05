import java.io.*;
class ImageCopy5{
	public static void main(String[] args) {
		String uh = System.getProperty("user.home");
		String sep = File.separator;
		byte[] mem = new byte[1024];
		File imagefile=new File(uh + sep + "java" + sep + "coachingcopy.jpeg");
		File copyimagefile =new File(uh + sep + "java" + sep + "copypic.jpeg");
		try{
			FileInputStream fis = new FileInputStream(imagefile);
			FileOutputStream fos = new FileOutputStream(copyimagefile);
			BufferedInputStream bis =new BufferedInputStream(fis, 1024);
			BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
			int data;
			while ((data = bis.read(mem, 0, 1024)) != -1) {
				bos.write(mem, 0,data);
			}
	        }catch(Exception e) {
	            e.printStackTrace();
   		}
	}
}
