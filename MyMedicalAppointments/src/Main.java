import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Jean Chuquispuma","Traumatología");
        myDoctor.addAvaibleAppointment(new Date(), "4pm");
        myDoctor.addAvaibleAppointment(new Date(), "10am");
        myDoctor.addAvaibleAppointment(new Date(), "1pm");

        System.out.println(myDoctor);
        /*
        for (model.Doctor.AvaibleAppointment aA:
             myDoctor.getAvaibleAppointments()) {
            System.out.println(aA.getDate()+ " " + aA.getTime());
        }

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        System.out.println(patient);*/
    }
}
