package carsWorkshop;
import java.util.ArrayList;
        
public class CustomerManagement {
    ArrayList<Customer> activeCustomers;
    ArrayList<Customer> inProgressCustomers;
    ArrayList<Customer> readyCustomers;
    
    /*Métodos de activeCustomers*/
    public void RegisterCustomer(Customer newCustomer){
        this.activeCustomers.add(newCustomer);
    }
    
    public void PrintActiveCustomers(){
        System.out.println("Los siguientes clientes se encuentran activos: ");
        for(Customer customer : this.activeCustomers){
            System.out.println(" > " + customer.name);
        }
    }
    
    /*Métodos de inProgressCustomers*/
    public void RegisterInProgressCustomer(int customerId){
        for(Customer customer : this.activeCustomers){
            if(customer.id == customerId){
                this.inProgressCustomers.add(customer);
            }
        }
    }
    public void PrintInProgressCustomers(){
        System.out.println("Los siguientes clientes se encuentran en reparación o mantenimiento: ");
        for(Customer customer : this.inProgressCustomers){
            System.out.println(" > " + customer.name);
        }
    }
    
    /*Métodos de readyCustomers*/
    public void RegisterReadyCustomer(int customerId){
        for(Customer customer : this.activeCustomers){
            if(customer.id == customerId){
                this.readyCustomers.add(customer);
            }
        }
    }
    
    public void PrintReadyCustomers(){
        System.out.println("Los siguientes clientes se encuentran listos: ");
        for(Customer customer : this.readyCustomers){
            System.out.println(" > " + customer.name);
        }
    }
}
