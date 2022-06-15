import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Jean Chuquispuma","Traumatología");

        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());

    }
}
