public class RecordTester{
	public static void main(String[] args){
		MyRecord mr=new MyRecord(55,"ziad khan");
		System.out.println(mr.name()+"  "+mr.age());//name and ge cannt be assigned next bcz record is like final
	}
}
