class stringtest{
	public static void main(String[] args){
		String s1="LUCKNOW";
		String s2= new String("LUCKNOW");
		System.out.println(s1+" "+s2);
		String s3="LUCKNOW";
                String s4= new String("LUCKNOW");
		System.out.println(s1==s3); //jb hum direct string s1 bnate h tb string constant pool me ek class bnta h,agr whi dubara se koi same s3 me krenge to
		//wo same s1 ke class ka reference lega string constant pool se
		System.out.println(s2==s4);// lkn agr hm new ke sath banenge to wo dubara se reference lega ek naii class bnegi isiliye s1=s3 ture h kyuki same reference
// h but s2=s4 false kyuki calss differrent h to reference bhi alg hoga
	}
}
