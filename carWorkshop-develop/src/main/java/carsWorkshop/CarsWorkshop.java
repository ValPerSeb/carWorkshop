package carsWorkshop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CarsWorkshop {

    public static void main(String[] args) {
        CustomerManagement customerMgmt = new CustomerManagement();
        
        System.out.println("**Registro de citas disponibles**");
        ArrayList<LocalDateTime> availableDates = new ArrayList<>();
        int apptCount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de citas disponibles: "));
        for(int i=1; i <= apptCount; i++){
            System.out.println("Cita número " + i + ": ");
            availableDates.add(requestDate());
        }
        
        AppointmentManagement apptMgmt = new AppointmentManagement(availableDates);
        
        System.out.println("**Registro de Nuevo Cliente**");
        long id = Long.parseLong(JOptionPane.showInputDialog("Ingrese el documento de identidad del cliente: "));
        String name = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        String lastName = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");
        String address = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");
        long phone = Long.parseLong(JOptionPane.showInputDialog("Ingrese el teléfono del cliente: "));
        
        Customer newCustomer = new Customer(id, name, lastName, address, phone);
        //Inicio validaciones para evitar campos vacios o con error.
        if(newCustomer.id == 0){
            String vali="123456789012";
            do{
                System.out.println("El id no puede ser mayor a 11 dígitos");
                newCustomer.id = Long.parseLong(JOptionPane.showInputDialog("Ingrese el documento de identidad del cliente: "));
                vali=String.valueOf(newCustomer.id);
            }while(vali.length()>11);
        }
        if(newCustomer.name == null){
            newCustomer.name = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        }
        if(newCustomer.lastName == null){
            newCustomer.lastName = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");
        }
        if(newCustomer.address == null){
            newCustomer.address = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");
        }
        if(newCustomer.phone == 0){
            String vali="123456789012";
            do{
                System.out.println("El id no puede ser mayor a 11 dígitos");
                newCustomer.phone = Long.parseLong(JOptionPane.showInputDialog("Ingrese el documento de identidad del cliente: "));
                vali=String.valueOf(newCustomer.phone);
            }while(vali.length()>11);
        }
        //Fin validaciones para evitar campos vacios o con error.
        customerMgmt.RegisterCustomer(newCustomer);
        
        System.out.println("**Registro de Nuevo Vehiculo**");
        String licensePlate = JOptionPane.showInputDialog("Ingrese la placa del vehiculo: ");
        if(licensePlate.length()>6){
            do{
                licensePlate = JOptionPane.showInputDialog("Recuerda que placa debe ser menor a 6 caracteres,  Ingrese la placa del vehiculo: ");
            }while(licensePlate.length()>6);
        }
        if(licensePlate.length()<=0){
            do{
                licensePlate = JOptionPane.showInputDialog("No has puesto ninguna placa,Ingrese la placa del vehiculo: "); 
            }while(licensePlate.length()<=0);
        }
        
        String brand = JOptionPane.showInputDialog("Ingrese la marca del vehiculo: ");
        if (brand.length()<=0){
            do{
                brand = JOptionPane.showInputDialog("No has puesto ninguna marca, Ingrese la marca del vehiculo: ");
            }while(brand.length()<=0);
        }
        int model = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo: "));
        if((String.valueOf(model).length())<=0){
            String vali="";
            do{
                model = Integer.parseInt(JOptionPane.showInputDialog("No has puesto modelo ,Ingrese el modelo del vehiculo: "));
                vali=String.valueOf(model);
            }while(vali.length()>=0);
        }
        double km = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el kilometraje del vehiculo: "));
        String category = JOptionPane.showInputDialog("Ingrese cual es la categoria del vehiculo:"
                   + "Sedan"
                   + "Camioneta"
                   + "Pick up"
                   + "SUV");
        if(category.length()<=0){
            do{
                category = JOptionPane.showInputDialog("Ingrese cual es la categoria del vehiculo:"
                   + "Sedan"
                   + "Camioneta"
                   + "Pick up"
                   + "SUV");
            }while(category.length()<=0);
        }
        
        Vehicle newVehicle = new Vehicle(licensePlate, brand, model, km, category);
        
        System.out.println("**Registro de Nueva Cita**");
        LocalDateTime newDate = requestDate();
        String type = JOptionPane.showInputDialog("Ingrese cual es el tipo de la cita:"
                   + "reparación"
                   + "mantenimiento");
        
        int consecutiveId = getConsecutiveId(apptMgmt.scheduledAppt);
        
        Appointment newAppointment = new Appointment(consecutiveId, newDate, newCustomer.id, newVehicle.licensePlate, type);
        
        apptMgmt.scheduleAppointment(newAppointment);
        
      
        
        int cant= Integer.parseInt(JOptionPane.showInputDialog("cuantos respuestos va a agregar"));
        Inventory SpareParts[] = new Inventory[cant];
    
        for (int i = 0; i < cant; i++) {
            int itemId=Integer.parseInt(JOptionPane.showInputDialog("ingrese el id"));
            String itemName=JOptionPane.showInputDialog("ingrese el nombre del repuesto");
            double unitPrice=Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio de la unidad"));
            int quantity=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad"));
                
                 SpareParts[i]=new Inventory(itemId,itemName,unitPrice,quantity);
                 

        }
        for (int i = 0; i < SpareParts.length; i++) {
            System.out.println("***********************");
            System.out.println("el id del elemento es :" + SpareParts[i].itemId);
            System.out.println("el nombre del elemento es :" + SpareParts[i].itemName);
            System.out.println("el Precio unitario del elemento es :" + SpareParts[i].unitPrice);
            System.out.println("la cantidad del elemento es :" + SpareParts[i].quantity);
            System.out.println("***********************");
        }
        
        
    }
    
    public static LocalDateTime requestDate(){
        System.out.println("-Ingresará los datos de la fecha de la cita (yyyy-MM-dd HH:mm)-");
        int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año (yyyy): "));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (MM): "));
        int day = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día (dd): "));
        int hour = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora (HH): "));
        int minutes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos (mm): "));
        
        return LocalDateTime.of(year, month, day, hour, minutes);
    }
    
    public static int getConsecutiveId(ArrayList<Appointment> existingAppts){
        int size = existingAppts.size();
        int consecutiveId = 000000;
        
        if(size > 0){
            consecutiveId = existingAppts.getLast().consecutiveId + 1;
        }
        
        return consecutiveId;
    }
    
    
}