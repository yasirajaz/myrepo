class UniqueElement2{
        public static void main(String... args){
                int[] arr={2,4,8,2,7,7,15,18,18,25,37,32,2,8};
                int[] freq=new int[555];
                for(int i=0;i<arr.length;i++){
                        freq[arr[i]]++;
                }
		int count=0;
		for(int i=0;i<freq.length;i++){
                        if(freq[i]==1) count++;
                }

                System.out.println(count);
        }
}
