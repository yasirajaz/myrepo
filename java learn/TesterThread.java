class TesterThread{
        public static void main(String[] args){
                MyThread mt=new MyThread();
                MyThread mt5=new MyThread();
                mt.setName("Sthread");
                mt5.setName("RThread");
                mt5.start();
                mt.start();
		for(int i=0;i<55555;i++){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                }
        }
}
