class TesterDCLL{
	public static void main(String... args){
		DCLL dc=new DCLL();
		dc.create(5);
		dc.traverse();
		dc.insert(7,4);
		dc.traverse();
		dc.insert(9,5);
		dc.traverse();
		dc.delete(1);
		dc.traverse();
		dc.delete(3);
		dc.traverse();
	}
}
