package carsWorkshop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Appointment {
    int consecutiveId;
    LocalDateTime date;
    int customerId;
    String vehicleLicense;
    String type;
    String status;
    Repair repair;
    String formattedDate;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public Appointment(int consecutiveId, LocalDateTime date, int customerId, String vehicleLicense, String type){
        String newConsecutiveId = String.valueOf(consecutiveId);
        if(newConsecutiveId.length() > 6){
            System.out.println("El consecutivo no puede ser mayor a 6 dígitos");
        }else{
            this.consecutiveId = consecutiveId;
        }
        
        String newType = type.toLowerCase();
        if(!"reparación".equals(newType) && !"mantenimiento".equals(newType)){
            System.out.println("El tipo ingresado no es válido");
        }else{
            this.type = newType;
        }
                
        int day = date.getDayOfWeek().getValue();
        String formatDate = date.format(formatter);
        String[] holidays = {"2024-03-25", "2024-03-28", "2024-03-29", "2024-05-01", "2024-05-13", "2024-06-03", "2024-06-10", "2024-07-01", "2024-08-07", "2024-08-19", "2024-10-14", "2024-11-04", "2024-11-11", "2024-12-25"};
        
        if(day == 6 || day == 7){
            System.out.println("El taller no acepta citas fines de semana");
        }else if(Arrays.asList(holidays).contains(formatDate)){
            System.out.println("El taller no acepta citas en días festivos");
        }else{
            this.date = date;
            this.formattedDate = formatDate;
        }
       
        this.customerId = customerId;
        this.vehicleLicense = vehicleLicense;
        this.status = "Active";
        this.repair = new Repair(this.vehicleLicense, "pending");
    }
    
    public void cancelAppointment(){
        LocalDateTime currentDate = LocalDateTime.now();
        String formattedCurrentDate = currentDate.format(formatter);
        if(formattedCurrentDate.equals(this.formattedDate)){
            System.out.println("No se puede cancelar citas el mismo día");
        } else{
            this.status = "Cancelled";
        }
    }  
}
