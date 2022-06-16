package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private String speciality;

    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //comportamientos
    ArrayList<AvaibleAppointment> avaibleAppointments = new ArrayList<>();
    public void addAvaibleAppointment(Date date, String time){
        avaibleAppointments.add(new Doctor.AvaibleAppointment(date, time));
    }

    public ArrayList<AvaibleAppointment> getAvaibleAppointments(){
        return avaibleAppointments;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + avaibleAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");
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

        @Override
        public String toString(){
            return "Available Appointments \nDate:" + date + "\nTime: " + time;
        }
    }
}
