class MainThread{
	public static void main(String[] args){
		Runnable r=new RThread();
		Thread t=new Thread(r,"RThread");
		Thread t5=new Thread(r,"Sthread");
		t.start();
		t5.start();
		for(int i=0;i<55555;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
