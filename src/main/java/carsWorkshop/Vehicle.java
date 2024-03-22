package carsWorkshop;

public class Vehicle {
    String licensePlate;
    String brand;
    int model;
    double km;
    String category;
    
    public Vehicle(String licensePlate, String brand, int model, double km, String category){
        if(licensePlate.length() > 6){
            System.out.println("La placa del vehiculo debe ser de 6 caracteres");
        }else{
            this.licensePlate = licensePlate;
        }
        if(!"Sedan".equals(category) && !"Camioneta".equals(category) && !"Pick up".equals(category) && !"SUV".equals(category)){
            System.out.println("La categoría ingresada no es valida");    
        }else{
            this.category = category;
        }
        this.brand  = brand;
        this.model = model;
        this.km = km;
    }
}