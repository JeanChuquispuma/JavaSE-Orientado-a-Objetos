public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor ...");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }
    //comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor:" + id);
    }
}
