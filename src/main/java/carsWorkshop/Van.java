
package carsWorkshop;

public class Van extends Vehicle {
     private boolean traccion4x4;
     private int burden;

    public Van(boolean traccion4x4, int burden, String licensePlate, String brand, int model, double km, String category) {
        super(licensePlate, brand, model, km, category);
        this.traccion4x4 = traccion4x4;
        this.burden = burden;
    }

    public boolean isTraccion4x4() {
        return traccion4x4;
    }

    public void setTraccion4x4(boolean traccion4x4) {
        this.traccion4x4 = traccion4x4;
    }

    public int getBurden() {
        return burden;
    }

    public void setBurden(int burden) {
        this.burden = burden;
    }
     
}