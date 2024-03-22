package carsWorkshop;

public class Customer {
    int id;
    String name;
    String lastName;
    String address;
    int phone;
    public Customer(int id, String name, String lastName, String address, int phone){
        String newId = String.valueOf(id);
        if(newId.length() > 11){
            System.out.println("El id no puede ser mayor a 11 dígitos");
        }else{
            this.id = id;
        }
        
        if(address.length() > 30){
            System.out.println("La dirección no puede ser mayor a 30 dígitos");
        }else{
            this.address = address;
        }
        
        String newPhone = String.valueOf(phone);
        if(newPhone.length() > 11){
            System.out.println("El teléfono no puede ser mayor a 11 dígitos");
        }else{
            this.phone = phone;
        }
        
        this.name = name;
        this.lastName = lastName;      
    }
}
