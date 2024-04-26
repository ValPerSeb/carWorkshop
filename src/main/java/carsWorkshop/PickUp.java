
package carsWorkshop;

public class PickUp extends Vehicle{
    private int burden;

    public PickUp(int burden, String licensePlate, String brand, int model, double km, String category) {
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
