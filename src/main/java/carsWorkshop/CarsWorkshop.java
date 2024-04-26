package carsWorkshop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CarsWorkshop {

    public static void main(String[] args) {
        CustomerManagement customerMgmt = new CustomerManagement();
        
        JOptionPane.showMessageDialog(null, "**Registro de citas disponibles**");
        ArrayList<LocalDateTime> availableDates = new ArrayList<>();
        int apptCount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de citas disponibles: "));
        if (apptCount > 5){
            do {
                JOptionPane.showMessageDialog(null, "El número maxímo de citas que se pueden crear es 5");
                apptCount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de citas disponibles: "));
            } while (apptCount > 5);
        }
        for(int i=1; i <= apptCount; i++){
            JOptionPane.showMessageDialog(null, "Cita número " + i + ": ");
            availableDates.add(requestDate());
        }
        
        AppointmentManagement apptMgmt = new AppointmentManagement(availableDates);
        
        JOptionPane.showMessageDialog(null, "**Registro de Nuevo Cliente**");
        int validationSize = 11;
        String id = JOptionPane.showInputDialog("Ingrese el documento de identidad del cliente: ");
        if(id.length() > validationSize || id.isEmpty()){
            do{
                JOptionPane.showMessageDialog(null, "El id no puede ser mayor a 11 dígitos o estar vacío");
                id = JOptionPane.showInputDialog("Ingrese el documento de identidad del cliente: ");
            }while(id.length() > validationSize || id.isEmpty());
        }
        long idNumber = Long.parseLong(id);
        String name = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        if(name.isEmpty()){
            do{
                name = (JOptionPane.showInputDialog("El nombre no debe estar vacío, ingrese el nombre del cliente: "));
            }while(name.isEmpty());
        }
        String lastName = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");
        if(lastName.isEmpty()){
            do{
                lastName = (JOptionPane.showInputDialog("El apellido no debe estar vacío, ingrese el apellido del cliente: "));
            }while(lastName.isEmpty());
        }
        String address = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");
        if(address.isEmpty()){
            do{
                address = (JOptionPane.showInputDialog("La dirección no debe estar vacía, ingrese la dirección del cliente: "));
            }while(address.isEmpty());
        }
        String phone = JOptionPane.showInputDialog("Ingrese el teléfono del cliente: ");
        if(phone.length() > validationSize || phone.isEmpty()){
            do{
                JOptionPane.showMessageDialog(null, "El teléfono no puede ser mayor a 11 dígitos o estar vacío");
                phone = JOptionPane.showInputDialog("Ingrese el teléfono del cliente: ");
            }while(phone.length() > validationSize || phone.isEmpty());
        }
        long phoneNumber = Long.parseLong(phone);
        
        Customer newCustomer = new Customer(idNumber, name, lastName, address, phoneNumber);
       
        customerMgmt.RegisterCustomer(newCustomer);
        
        JOptionPane.showMessageDialog(null, "**Registro de Nuevo Vehículo**");
        String licensePlate = JOptionPane.showInputDialog("Ingrese la placa del vehículo: ");
        if(licensePlate.length()>6){
            do{
                licensePlate = JOptionPane.showInputDialog("Recuerda que placa debe ser menor a 6 caracteres, ingrese la placa del vehículo: ");
            }while(licensePlate.length()>6);
        }
        if(licensePlate.length()<=0){
            do{
                licensePlate = JOptionPane.showInputDialog("No has puesto ninguna placa, ingrese la placa del vehículo: "); 
            }while(licensePlate.length()<=0);
        }
        String brand = JOptionPane.showInputDialog("Ingrese la marca del vehículo: ");
        if (brand.length()<=0){
            do{
                brand = JOptionPane.showInputDialog("No has puesto ninguna marca, ingrese la marca del vehículo: ");
            }while(brand.length()<=0);
        }
        int model = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehículo: "));
        if((String.valueOf(model).length())<=0){
            String vali="";
            do{
                model = Integer.parseInt(JOptionPane.showInputDialog("No has puesto modelo, ingrese el modelo del vehículo: "));
                vali=String.valueOf(model);
            }while(vali.length()>=0);
        }
        double km = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el kilometraje del vehículo: "));
        String category = JOptionPane.showInputDialog("Ingrese la categoría del vehículo: \nSedan \nCamioneta \nPickUp \nSUV");
        
        if (category.length() <= 0) {
            do {
                category = JOptionPane.showInputDialog("Ingrese la categoría del vehículo: \nSedan \nCamioneta \nPickUp \nSUV");
            } while (category.length() <= 0);
        }
        String vehicleLicensePlate = "";
        if (category.equalsIgnoreCase("Sedan")) {
            JOptionPane.showMessageDialog(null, "Has seleccionado la categoría Sedan");
            int isAutomatic = Integer.parseInt(JOptionPane.showInputDialog("El vehículo es automático: \n1- Si \n2- No"));
            boolean isAutomaticBoolean = false;
            if (isAutomatic == 1) {
                isAutomaticBoolean = true;
            }
            Sedan newVehicle = new Sedan(isAutomaticBoolean,licensePlate,brand,model,km,category);
            vehicleLicensePlate = newVehicle.getLicensePlate();
        } else if (category.equalsIgnoreCase("Camioneta")) {
            JOptionPane.showMessageDialog(null, "Has seleccionado la categoría Camioneta");
            int is4x4 = Integer.parseInt(JOptionPane.showInputDialog("El vehículo es 4x4: \n1- Si \n2- No"));
            boolean is4x4Boolean = false;
            if (is4x4 == 1) {
                is4x4Boolean = true;
            }
            int burden = Integer.parseInt(JOptionPane.showInputDialog("Cual es la capacidad de carga: "));
            Van newVehicle = new Van(is4x4Boolean,burden,licensePlate,brand,model,km,category);
            vehicleLicensePlate = newVehicle.getLicensePlate();
        } else if (category.equalsIgnoreCase("PickUp")) {
            JOptionPane.showMessageDialog(null, "Has seleccionado la categoría PickUp");
            int burden = Integer.parseInt(JOptionPane.showInputDialog("Cual es la capacidad de carga: "));
            PickUp newVehicle = new PickUp(burden,licensePlate,brand,model,km,category);
            vehicleLicensePlate = newVehicle.getLicensePlate();
        } else if (category.equalsIgnoreCase("SUV")) {
            JOptionPane.showMessageDialog(null, "Has seleccionado la categoría SUV");
            int numberOfDoors = Integer.parseInt(JOptionPane.showInputDialog("Cuantas puertas tiene el vehículo: "));
            Suv newVehicle = new Suv(numberOfDoors,licensePlate,brand,model,km,category);
            vehicleLicensePlate = newVehicle.getLicensePlate();
        } else {
            JOptionPane.showMessageDialog(null, "Categoría no válida. Por favor, seleccione una categoría válida.");
        }

        JOptionPane.showMessageDialog(null, "**Registro de Nueva Cita**");
        LocalDateTime newDate = requestDate();
        String type = JOptionPane.showInputDialog("Ingrese cual es el tipo de la cita: \nreparación \nmantenimiento");
        
        int consecutiveId = getConsecutiveId(apptMgmt.scheduledAppt);
        
        Appointment newAppointment = new Appointment(consecutiveId, newDate, newCustomer.getId(), vehicleLicensePlate, type);
        
        apptMgmt.scheduleAppointment(newAppointment);
         
        int cant= Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos respuestos va a agregar?"));
        Inventory SpareParts[] = new Inventory[cant];
    
        for (int i = 0; i < cant; i++) {
            int itemId=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id"));
            String itemName=JOptionPane.showInputDialog("Ingrese el nombre del repuesto");
            double unitPrice=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la unidad"));
            int quantity=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
                
                 SpareParts[i]=new Inventory(itemId,itemName,unitPrice,quantity);
        }
        
        for (int i = 0; i < SpareParts.length; i++) {
            System.out.println("***********************");
            System.out.println("El id del elemento es: " + SpareParts[i].getItemId());
            System.out.println("El nombre del elemento es: " + SpareParts[i].getItemName());
            System.out.println("El Precio unitario del elemento es: " + SpareParts[i].getUnitPrice());
            System.out.println("La cantidad del elemento es: " + SpareParts[i].getQuantity());
            System.out.println("***********************");
        }  
    }
    
    public static LocalDateTime requestDate(){
        System.out.println("-Ingresará los datos de la fecha de la cita (yyyy-MM-dd HH:mm)-");
        int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año (yyyy): "));
        if (year != 2024 && year != 2025){
            do {
                JOptionPane.showMessageDialog(null, "El año ingresado no es valido");
                year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año (yyyy): "));
            } while (year != 2024 && year != 2025);
        }
        int month = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (MM): "));
        if (month < 1 || month > 12){
            do {
                JOptionPane.showMessageDialog(null, "El mes ingresado no es valido");
                month = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (MM): "));
            } while (month < 1 || month > 12);
        }
        int day = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día (dd): "));
        if (day < 1 || day > 31){
            do {
                JOptionPane.showMessageDialog(null, "El día ingresado no es valido");
                day = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día (dd): "));
            } while (day < 1 || day > 31);
        }
        int hour = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora (HH): "));
        if (hour < 00 || hour > 23){
            do {
                JOptionPane.showMessageDialog(null, "La hora ingresada no es valida");
                hour = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora (HH): "));
            } while (hour < 00 || hour > 23);
        }
        int minutes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos (mm): "));
        if (minutes < 00 || minutes > 59){
            do {
                JOptionPane.showMessageDialog(null, "Los minutos ingresados no son validos");
                minutes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos (mm): "));
            } while (minutes < 00 || minutes > 59);
        }
        return LocalDateTime.of(year, month, day, hour, minutes);
    }
    
    public static int getConsecutiveId(ArrayList<Appointment> existingAppts){
        int size = existingAppts.size();
        int consecutiveId = 000000;
        
        if(size > 0){
            consecutiveId = existingAppts.getLast().getConsecutiveId()+ 1;
        }
        
        return consecutiveId;
    }   
}