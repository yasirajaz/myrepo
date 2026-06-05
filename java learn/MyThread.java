class MyThread extends Thread{
	public void run(){
                for(int i=0;i<55555;i++){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                }
        }
}

