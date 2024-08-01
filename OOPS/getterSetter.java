class Shop{
    private int itemPrice;
    private String itemName; 

    String setItemName(String itemName){  //Setter
        return this.itemName = itemName ;
    }

    String getItemName(){  //Getter which will provide the value of the private variable
        return this.itemName;
    }
}

public class getterSetter {
    public static void main(String[] args) {
        Shop customer = new Shop();
        customer.setItemName("Soap");
        System.out.println(customer.getItemName());
    }
}
