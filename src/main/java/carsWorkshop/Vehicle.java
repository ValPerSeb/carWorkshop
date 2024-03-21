package carsWorkshop;

public class Vehicle {
 
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos vehiculos va a Guardar:"));
        Metodos Vector[] = new Metodos[n];
        for (int i = 0; i < n; i++) {
           Metodos Ns = new Metodos();
           Ns.setMarca(JOptionPane.showInputDialog(null, "Ingrese el nombre del vehiculo: "));
           Ns.setKilometraje(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cual es el kilometraje del vehiculo:")));
           Ns.setModelo(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cual es el modelo del vehiculo:")));
           Ns.setCategoria(JOptionPane.showInputDialog(null, "Ingrese cual es la categoria del vehiculo:"
                   + "1.sedan"
                   + "2.Camioneta"
                   + "3.pick up"
                   + "4.suv"));
           Vector[i] = Ns;
           System.out.println("El nombre del vehiculo es: "+Vector[i].getMarca()+"\ny el kilometraje es: "+Vector[i].getKilometraje()+"\ny el modelo del vehiculo es: "+Vector[i].getModelo()+"\ny la categoria es:"+Vector[i].getCategoria());
           System.out.println();
        }
    }
}
}

public class Metodos {
    private String Marca;/*primera variable creada con encasulamiento de datos*/
    private int Placa;
    private int Kilometraje;
    private String Categoria;
    private int Modelo;
    public Metodos() {/*Cuando va void aquí es porque no retorna nada*/
    }
    public String Marca(){
        return Marca;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public int getPlaca(){
        return Placa;
    }
 
    public void setPlaca(int Placa){
        this.Placa = Placa;
    }
       public int getKilometraje(){
        return Kilometraje;
    }
    public void setKilometraje(int Kilometraje){
        this.Kilometraje = Kilometraje;
    }
       public String getCategoria(){
        return Categoria;
    }
    public void setCategoria(String Categoria){
        this.Categoria = Categoria;
    }
    public int getModelo(){
        return Modelo;
    }
    public void setModelo(int Modelo){
        this.Modelo = Modelo;
    }
}
