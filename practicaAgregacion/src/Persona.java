public class Persona {
    private String nombre;

    private Perro perro;

    //Constructores
    public Persona (String pNombre){
        nombre = pNombre;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    //Setters
    public void setPersona(String pNombre){
        nombre = pNombre;
    }

    //Métodos
    public void agregarMascota(Perro pPerro){
        perro = pPerro;
    }

    public void jugarConMascota (String instruccion){
        perro.jugar(instruccion);
    }
}
