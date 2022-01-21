class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;
        if(rows * columns != r * c){
            return mat;
        }
        
        int[][] mat_r = new int[r][c];
        int arr[] = new int[r*c];
        int k = 0;
        for(int i =0;i<rows;i++){
            for(int j =0;j<columns;j++){
               arr[k]=mat[i][j];
                k++;
            }
        }
        k= 0;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
               mat_r[i][j] = arr[k];
                k++;
            }
        }
       return mat_r; 
    }
}