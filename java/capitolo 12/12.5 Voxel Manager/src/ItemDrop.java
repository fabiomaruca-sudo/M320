public class ItemDrop {
    private String itemName;
    private int quantity;

    //COSTRUTTORE
    public ItemDrop(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    //SETTER
    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    //METODI
    public String ritorna() {
        return "["+quantity+"] x ["+itemName+"]";
    }
}
