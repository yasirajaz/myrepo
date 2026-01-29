class array2dmultiply{
	public static void main(String[] args){
		int[][] a={{1,2,1},{1,2,1},{1,2,1}};
		int[][] b={{1,2,1},{1,2,1},{1,2,1}};
		if(a[0].length==b.length){
			int[][] c= new int[a.length][b[0].length];
			for(int i=0;i<a.length;i++){
				for(int j=0;j<b[0].length;j++){
					c[i][j] = 0;
					for (int k = 0; k < a[0].length; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			for (int i=0;i<c.length; i++) {
				for (int j=0;j<c[i].length;j++){
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}

		}else{
			System.out.println("Matrix multiplication not possible");
		}
	}
}
