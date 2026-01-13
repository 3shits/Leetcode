class NumMatrix {
    int prefmatrix[][];
    public NumMatrix(int[][] matrix) {
        int rows = matrix.length , cols = matrix[0].length;
        prefmatrix = new int[rows+1][cols+1];
        
        for(int i = 0; i < rows ; i++)
        {
            for(int j = 0 ;  j < cols ; j++)
            prefmatrix[i+1][j+1] = matrix[i][j]+prefmatrix[i+1][j] + prefmatrix[i][j+1] -prefmatrix[i][j];
        } 
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefmatrix[row2+1][col2+1] - prefmatrix[row1][col2+1] - prefmatrix[row2+1][col1] + prefmatrix[row1][col1];   
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */