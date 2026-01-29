class arrray2dsum{
	public static void main(String[] args){
		int[][] arr1={{1,2,3,4},{1,1,1,1},{2,2,2,2},{3,4,5,6}};
		int[][] arr2={{1,1,1,1},{4,5,6,7},{1,2,3,4},{2,3,4,5}};
		int[][] arr3=new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				if(arr1.length==arr2.length && arr1[0].length==arr2[0].length)
					arr3[i][j]=arr1[i][j]+arr2[i][j];
				else System.out.println("addition not possible due to different matrix dimension ");
			}
		}
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr3[i][j]+" ");
                        }
			System.out.println();
                }
	}
}
