public class Interface{
    public static void main(String args[]){
        
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("All direction");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Vertical abd Horizontal");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("1 move anywhere");
    }
} 