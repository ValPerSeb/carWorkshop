package carsWorkshop;

public class Inventory {
    private int itemId;
    private String itemName;
    private double unitPrice;
    private int quantity;
    
    public Inventory(int itemId, String itemName, double unitPrice, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void showItemDetails(){
        System.out.println("El item " + this.itemName + " con código " + this.itemId + " actualmente dispone de " + this.quantity + " unidad(es) y su valor individual es de " + this.unitPrice);
    }
}