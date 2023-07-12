class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] new2darray = new int[m][n];
        int length=original.length;
        if(m*n == length){
            int x=0;
            for(int i=0; i<new2darray.length; i++){
                for(int j=0; j<new2darray[0].length; j++){
                new2darray[i][j]=original[x++];
                }
            }
        }
        else{
            return new int[0][0];
        }
        return new2darray;
    }
}
