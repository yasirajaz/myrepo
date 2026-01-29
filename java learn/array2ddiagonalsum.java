class array2ddiagonalsum{
	public static void main(String[] args){
                int[][] td={{1,2,3,4},{10,20,30,40},{11,22,33,44},{6,7,8,9}};
                int sum=0;
		for(int i=0;i<td.length;i++){
				sum +=td[i][i];
                }
                System.out.println(sum);
        }
}
