package carsWorkshop;

public class Vehicle {
    private String licensePlate;
    private String brand;
    private int model;
    private double km;
    private String category;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
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