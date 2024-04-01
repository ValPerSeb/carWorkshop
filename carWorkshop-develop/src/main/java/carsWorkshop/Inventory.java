package carsWorkshop;

public class Inventory {
    int itemId;
    String itemName;
    double unitPrice;
    int quantity;

    public Inventory(int itemId, String itemName, double unitPrice, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    public void showItemDetails(){
        System.out.println("El item " + this.itemName + " con código " + this.itemId + " actualmente dispone de " + this.quantity + " unidad(es) y su valor individual es de " + this.unitPrice);
    }
}