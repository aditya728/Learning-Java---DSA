public class AdvPatterns {

    // Hollow rectangle function
    public static void hollowRectangle(int row, int column){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print(" *");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Inverted triangle function
    public static void invertedTriangle(int row){

        for(int i = 1; i<=row; i++){
            for(int j=1; j<= row-i; j++){
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // Inverted half pyramid
    public static void invertedPyramid(int row){
        for( int i=1; i<=row; i++){
            
            for(int j=1; j <= row-i+1 ;j++){
                
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //Floyds Triangle
    public static void floydsTriangle(int row){
        int counter = 1;
        for(int i= 1; i<=row; i++){
            for(int j =1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle
    public static void numTriangle(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                if ((i+j) % 2 ==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //Butterfly pattern
    public static void butterfly(int row){
        for (int i=1; i<=row; i++){

            //Stars
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }

            //Spaces
            for(int j=1; j<= 2*(row-i); j++){
                System.out.print("  ");
            }
            
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }

            System.out.println();
        }

        //Mirror
        for(int i=row; i>=1; i--){

            for(int j=1; j<=i;j++){
                System.out.print(" *");
            }

            for(int j=1; j<= 2* (row-i);j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    //Solid Rhombus pattern
    public static void solidRhombus(int row){
        for(int i=1; i<=row;i++){
            for(int j =1; j<=(row-i); j++){
                System.out.print("  ");
            }

            for(int j = 1; j<=row; j++){
                System.out.print("   *");
            }
            System.out.println();
        }
    }

    //Hollow rhombus
    public static void hollowRhombus(int row){
        for(int i=1; i<=row; i++){

            //Spaces
            for(int j=1; j<=(row-i); j++){
                System.out.print("  ");
            }

            //Stars and hole 
            for(int j=1; j<=row; j++){
                if (i==1 ||i==row||j==1||j==row) {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Diamond Pattern
    public static void diamondPattern(int row){
        for(int i=1; i<=row;i++){
            for(int j=1; j<=(row-i);j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=row; i>=1;i--){
            for(int j=1; j<=(row-i);j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Number pyramid
    public static void numPyramid(int row){
         for(int i=1; i<=row; i++){

            for(int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
         }
    }

    //Palindrome pattern
    public static void palindromPattern(int row){

        for(int i=1; i<=row;i++){

            for(int j=1; j<=(row-i);j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        
        // hollowRectangle(5, 8);
        // invertedTriangle(5);
        // invertedPyramid(5);
        // floydsTraingle(5);
        // numTriangle(5);
        // butterfly(4);
        // solidRhombus(6);
        // hollowRhombus(7);
        // diamondPattern(6);
        // numPyramid(9);
        palindromPattern(5);
    }
}
