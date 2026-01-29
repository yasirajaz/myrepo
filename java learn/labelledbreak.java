class labelledbreak{
	public static void main(String[] args){
		for(int i=0;i<5;i++){
		ab:
			for(int j=0;j<5;j++){
				for(int k=0;k<5;k++){
					if(i==2) break ab;
					System.out.println(i+"*"+j+"*"+k);
				}
			}
		}
	}
}
