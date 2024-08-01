public class MazePath {

    static int findWays(int r, int c){
        //base case
        if(r==1 || c==1){
            return 1;
        }
        //recursion
        int right = findWays(r, c-1);
        int down = findWays(r-1, c);

        return right+down;
    }
    static void findPath(String ans, int r, int c){
        //base case
        if(r==1 && c==1){
            System.out.println(ans);
            return;
        }
        //recursion
        if(c>1){

            findPath(ans+"R",r, c-1);
        }
        if(r>1){

            findPath(ans+"D",r-1, c);
        }
    }

    public static void main(String[] args) {
        // System.out.println(findWays(4, 3));
        findPath("", 4, 3);
    }
}
