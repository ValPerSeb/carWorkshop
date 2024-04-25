package carsWorkshop;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class AppointmentManagement {
    ArrayList<LocalDateTime> availableAppt = new ArrayList<>(); //citas disponibles.
    ArrayList<Appointment> scheduledAppt = new ArrayList<>(); //citas programadas.
    DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //Formatear fecha a patrón.
    DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("hh:mm"); //Formatear hora a patrón.

    public AppointmentManagement(ArrayList<LocalDateTime> availableAppt) {
        this.availableAppt = availableAppt;
    }
    
    public void showAvailableAppt(){ //Mostrar citas disponibles.
        System.out.println("*** Citas disponibles ***");
        for(LocalDateTime appt : availableAppt){
            System.out.println("******");
            System.out.println("Fecha:" + appt.format(formatterDate));
            System.out.println("Hora: " + appt.format(formatterTime));
            System.out.println("******");
        }
    }
    
    public void scheduleAppointment(Appointment newAppointment){//Programar citas.
        LocalDate currentDate = LocalDate.now();
        int currentDateAppointments = 0;
        ArrayList<Appointment> customerAppointments = new ArrayList<>();
        
        if(!availableAppt.contains(newAppointment.getDate())){
            System.out.println("Cita no disponible");
            return;
        }
        
        for(Appointment appt : this.scheduledAppt){
            if(currentDate.equals(appt.getDate().toLocalDate())){
                currentDateAppointments++;
            }
            if(appt.getCustomerId() == newAppointment.getCustomerId()){
                customerAppointments.add(appt);
            }
            
            if(appt.getFormattedDate().equals(newAppointment.getFormattedDate())){
                LocalTime scheduledTime = appt.getDate().toLocalTime().truncatedTo(ChronoUnit.HOURS);
                LocalTime newTime = newAppointment.getDate().toLocalTime().truncatedTo(ChronoUnit.HOURS);
                if(scheduledTime.equals(newTime)){
                    System.out.println("Fecha y horario ya está ocupado");
                    return;
                }
            }
        }
        
//        for(Appointment cAppt : customerAppointments){
//            // Logica para tener la cuenta de las citas del cliente en la misma semana y mostrar error si van más de 5.
//        }
        
        if(currentDateAppointments > 3){
            System.out.println("Límite de 4 citas por día excedido. Crear nueva cita para otro día hábil");
            return;
        }
        
       
        this.scheduledAppt.add(newAppointment);
        System.out.println("Cita agregada existosamente");
        
    }
    
}
