import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Jean Chuquispuma","Traumatología");

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
