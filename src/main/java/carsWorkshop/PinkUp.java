
package carsWorkshop;

public class PinkUp extends Vehicle{
    private int burden;

    public PinkUp(int burden, String licensePlate, String brand, int model, double km, String category) {
        super(licensePlate, brand, model, km, category);
        this.burden = burden;
    }

    public int getBurden() {
        return burden;
    }

    public void setBurden(int burden) {
        this.burden = burden;
    }
    
}
