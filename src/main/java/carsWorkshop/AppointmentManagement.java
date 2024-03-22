package carsWorkshop;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class AppointmentManagement {
    ArrayList<LocalDateTime> available;
    ArrayList<Appointment> scheduled;

    public AppointmentManagement(ArrayList<LocalDateTime> available) {
        this.available = available;
    }
    
    public void scheduleAppointment(Appointment newAppointment){
        
    }
    
}
