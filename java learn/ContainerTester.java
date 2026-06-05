class ContainerTester{
	public static void main(String... args){
		DataPacket<String> dp=new DataPacket<>("Lucknow");
		DataPacket<Integer> dp5=new  DataPacket<>(5);
		System.out.println(dp.x);
		System.out.println(dp5.x);
	}
}
