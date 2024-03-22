package carsWorkshop;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Repair {
    String licensePlate;
    String status;
    ArrayList<Inventory> inventory = new ArrayList<>();
    
    public Repair(String licensePlate, String status){
        this.licensePlate = licensePlate;
        if(!"ready".equals(status) && !"InProgress".equals(status) && !"pending".equals(status)){
            System.out.println("El estado ingresado no es valido");
        }else{
            this.status = status;
        }
    }
    
    public void statusChange(String newStatus){
        if(!"ready".equals(newStatus) && !"InProgress".equals(newStatus) && !"pending".equals(newStatus)){
            System.out.println("El estado ingresado no es valido");
        }else{
            this.status = newStatus;
        }
    }
    
    public void registerInventory(){
        int itemId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del item: "));
        String itemName = JOptionPane.showInputDialog("Ingrese el nombre del item: ");
        double unitPrice = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del item: "));
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del item: "));

        Inventory item = new Inventory(itemId, itemName, unitPrice, quantity);
        this.inventory.add(item);
    }
    
    public void showInventory(){
        for(Inventory item : this.inventory){
            item.showItemDetails();
        }
    }
}