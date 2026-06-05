import java.io.*;
class CopyImage {
	public static void main(String[] args) {
		try{
			FileInputStream fin=new FileInputStream("coaching.jpeg");
			FileOutputStream fou=new FileOutputStream("coachingcopy.jpeg");
			int i;
			while(true){
				i=fin.read();
				if(i==-1) break;
				fou.write(i);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
