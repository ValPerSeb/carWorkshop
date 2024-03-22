package carsWorkshop;

import javax.swing.JOptionPane;

public class CarsWorkshop {

    public static void main(String[] args) {
        CustomerManagement customerMgmt = new CustomerManagement();
        
        System.out.println("**Registro de Nuevo Cliente**");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento de identidad del cliente: "));
        String name = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        String lastName = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");
        String address = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");
        int phone = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del cliente: "));
        
        Customer newCustomer = new Customer(id, name, lastName, address, phone);
        customerMgmt.RegisterCustomer(newCustomer);
        
        System.out.println("**Registro de Nuevo Vehiculo**");
        String licensePlate = JOptionPane.showInputDialog("Ingrese la placa del vehiculo: ");
        String brand = JOptionPane.showInputDialog("Ingrese la marca del vehiculo: ");
        int model = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo: "));
        double km = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el kilometraje del vehiculo: "));
        String category = JOptionPane.showInputDialog("Ingrese cual es la categoria del vehiculo:"
                   + "Sedan"
                   + "Camioneta"
                   + "Pick up"
                   + "SUV");
        
        Vehicle newVehicle = new Vehicle(licensePlate, brand, model, km, category);
        
        System.out.println("**Registro de Nueva Cita**");
        
        
        
    }
}