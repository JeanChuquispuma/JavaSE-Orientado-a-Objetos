import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Jean Chuquispuma","Traumatología");
        myDoctor.addAvaibleAppointment(new Date(), "4pm");
        myDoctor.addAvaibleAppointment(new Date(), "10am");
        myDoctor.addAvaibleAppointment(new Date(), "1pm");

        System.out.println(myDoctor.getAvaibleAppointments());

        for (Doctor.AvaibleAppointment aA:
             myDoctor.getAvaibleAppointments()) {
            System.out.println(aA.getDate()+ " " + aA.getTime());
        }

        /*
        int i = 0;
        int b = 2;
        b = i;
        //b=0
        String name = "Ann";

        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        Patient patient1 =  new Patient("Anahi", "anahi@gmail.com");

        System.out.println(patient.getName());
        System.out.println(patient1.getName());

        patient1 = patient;

        System.out.println(patient.getName());
        System.out.println(patient1.getName());

        patient1.setName("Diego");
        System.out.println(patient.getName());
        System.out.println(patient1.getName());

        /*
        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());
        */
    }
}
