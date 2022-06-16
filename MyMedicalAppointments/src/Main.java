import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Jean Chuquispuma","Traumatología");
        myDoctor.addAvaibleAppointment(new Date(), "4pm");
        myDoctor.addAvaibleAppointment(new Date(), "10am");
        myDoctor.addAvaibleAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Benito", "benito@gmail.com");
        user.showDataUser();

        System.out.println();
        System.out.println();

        User userPa = new Patient("Benito", "benito@gmail.com");
        userPa.showDataUser();

        User user1 = new User("Benito","Benito@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento de Geriatria");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
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
