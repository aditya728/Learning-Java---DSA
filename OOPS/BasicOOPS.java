class Pen{  //Creating a class
    String penColor ;
    int penPrice;      //Data in a class

    void setColor(String newColor){ //Func in a class
        penColor = newColor;
    }
}

//Acces Modifiers
class BankAccount{
    public String userName;
    private String passWord; // Cant be accessed or called outside this class

    public void changePass(String pwd){
        passWord = pwd;
    } // Now password can be changed from outside as it can be targeted by the public function which can be accessed from outside

}

public class BasicOOPS{ //Default class of a java file
    public static void main(String args[]){

        Pen p1 = new Pen(); // Creating a object of Pen class.
        p1.penColor = "white";

        BankAccount myAcc = new BankAccount();
        // myAcc.passWord; Not possible; 
        myAcc.changePass("potato"); //This is possible coz of public function. 
    }
}

  