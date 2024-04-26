
package carsWorkshop;

public class Sedan extends Vehicle{
    private boolean automatico;

    public Sedan(boolean automatico, String licensePlate, String brand, int model, double km, String category) {
        super(licensePlate, brand, model, km, category);
        this.automatico = automatico;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
}