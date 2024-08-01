public class DiagonalSum {

    //Brute force approach
    public static int diagonalAdd(int matrix[][]){
        int sum =0;
        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j]; 
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    } 

    // optimal approach
    public static int diagonalSum(int matrix[][]){
        int n = matrix.length;
        int sum=0;
        for(int i=0; i<n;i++){
            sum+=matrix[i][i];  //Value of [i][j] as we need i=j for primary diagnol

            if( i != n-1-i) // if i != j
            {
                sum+=matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{0,1,2},{3,4,5},{6,7,8}};
        System.out.println(diagonalAdd(matrix));
        System.out.println(diagonalSum(matrix));
    }
}
