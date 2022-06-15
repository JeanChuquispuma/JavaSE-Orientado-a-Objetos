import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor ...");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    //comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor:" + id);
    }

    ArrayList<AvaibleAppointment> avaibleAppointments = new ArrayList<>();
    public void addAvaibleAppointment(Date date, String time){
        avaibleAppointments.add(new Doctor.AvaibleAppointment(date, time));
    }

    public ArrayList<AvaibleAppointment> getAvaibleAppointments(){
        return avaibleAppointments;
    }
    public static class AvaibleAppointment{
        private int id;
        private Date date;
        private String time;

        public AvaibleAppointment(Date date, String time){
            this.date = date;
            this.time =  time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
