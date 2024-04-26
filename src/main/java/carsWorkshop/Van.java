
package carsWorkshop;

public class Van extends Vehicle {
     private boolean traction4x4;
     private int burden;

    public Van(boolean traction4x4, int burden, String licensePlate, String brand, int model, double km, String category) {
        super(licensePlate, brand, model, km, category);
        this.traction4x4 = traction4x4;
        this.burden = burden;
    }

    public boolean isTraccion4x4() {
        return traction4x4;
    }

    public void setTraction4x4(boolean traction4x4) {
        this.traction4x4 = traction4x4;
    }

    public int getBurden() {
        return burden;
    }

    public void setBurden(int burden) {
        this.burden = burden;
    }
}