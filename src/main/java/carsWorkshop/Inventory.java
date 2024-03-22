package carsWorkshop;

public class Inventory {
 public static void main(String[] args) {
    int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos vehiculos va a Guardar:"));
        Metodos Vector[] = new Metodos[n];
        for (int i = 0; i < n; i++) {
           Metodos Ns = new Metodos();
           Ns.setMarca(JOptionPane.showInputDialog(null, "Ingrese el nombre del vehiculo: "));
           Ns.setKilometraje(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cual es el kilometraje del vehiculo:")));
           Ns.setModelo(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cual es el modelo del vehiculo:")));
           Ns.setCategoria(JOptionPane.showInputDialog(null, "Ingrese cual es la categoria del vehiculo:"));
           Vector[i] = Ns;
           System.out.println("El nombre del vehiculo es: "+Vector[i].getMarca()+"\ny el kilometraje es: "+Vector[i].getKilometraje()+"\ny el modelo del vehiculo es: "+Vector[i].getModelo()+"\ny la categoria es:"+Vector[i].getCategoria());
           System.out.println();
        }
    }
}
public class Metodos {
    private String Name;/*primera variable creada con encasulamiento de datos*/
    private int Id;
    private int Costo;
    private int Cantidad;
    public Metodos() {/*Cuando va void aquí es porque no retorna nada*/
    }
    public String Name(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
       public int getCosto(){
        return Costo;
    }
    public void setCosto(int costo){
        this.Costo = costo;
    }
       public int getCantidad(){
        return Cantidad;
    }
    public void setCantidad(int cantidad){
        this.Cantidad = cantidad;
    }
}
