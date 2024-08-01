public class PatternsInRecursion {

    static void invertedTri(int row, int c){
        if(row==0){
            return;
        }
        if(c<row){
            System.out.print("*");
            invertedTri(row, c+1);
        }else{
            System.out.println();
            invertedTri(row-1, 0);
        }
    }

    public static void main(String[] args) {
        int row=4;
        invertedTri(row,0);
    }
}
