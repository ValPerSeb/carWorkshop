package carsWorkshop;

public class Customer {
    long id; //Se utiliza long debido a la cantidad de caracteres.
    String name;
    String lastName;
    String address;
    long phone; //Se utiliza long debido a la cantidad de caracteres.
    public Customer(long id, String name, String lastName, String address, long phone){
        String newId = String.valueOf(id);
        if(newId.length() > 11){
            System.out.println("El id no puede ser mayor a 11 dígitos");
        }else{
            this.id = id;
        }
        
        if(name.length() <= 0){
            System.out.println("El nombre no puede estar vacío");
        }else{
            this.name = name;
        }
        
        if(lastName.length() <= 0){
            System.out.println("El apellido no puede estar vacío");
        }else{
            this.lastName = lastName; 
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
    }
}