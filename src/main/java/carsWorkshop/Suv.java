package carsWorkshop;

public class Suv extends Vehicle {
    private int numberOfDoors;

    public Suv(int numberOfDoors, String licensePlate, String brand, int model, double km, String category) {
        super(licensePlate, brand, model, km, category);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    } 
}
