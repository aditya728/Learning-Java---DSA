public class SearchMatrix {

    //Stair case search approach for searching in sorted matrix
    public static boolean staircaseSearch(int mat[][], int key){
        int row =0;
        int col = mat[0].length-1;
        while(row < mat.length && col>=0){
            if(mat[row][col] == key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if(key>mat[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static boolean bottomStaircase(int mat[][], int key) {
        int row = mat.length-1;
        int col = 0;
        int iterations =0;
        while (row >=0 && col < mat[0].length) {
            if (mat[row][col] == key) {
                System.out.println("Key found at (" + row + "," + col + ")");
                System.out.println(iterations);
                return true;
            } 
            else if (key > mat[row][col]) {
                col++;
                iterations++;
            } 
            else {
                row--;
                iterations++;
            }
        }
        System.out.println("Key not found");
        System.out.println(iterations);
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        staircaseSearch(matrix, 33);
        bottomStaircase(matrix, 30);
    }
}
