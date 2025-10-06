import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellidos;

    //Constructores
    public Persona(String pNombre,
                   String pApellidos){
        nombre = pNombre;
        apellidos = pApellidos;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    //Setters
    public void setNombre(String pNombre){
        nombre = pNombre;
    }

    //ToString
    public String toString(){
        return "Nombre: " + nombre + " " + apellidos;
    }

    //Métodos
    public void comprarCepillo(LocalDate fecha,
                               boolean tieneBaterias){
        CepilloDientes nuevoCepillo = new CepilloDientes(fecha,
                tieneBaterias);
        System.out.println(nuevoCepillo);
    }

}
