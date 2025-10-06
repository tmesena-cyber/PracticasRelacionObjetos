public class Programador {
    private String nombre;

    //Constructor
    public Programador(String pNombre){
        nombre = pNombre;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    //Setters
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    //Métodos
    public void escribeCodigo(IDE programa, String nuevoCodigo){
        programa.correrPrograma(nuevoCodigo);
    }
}
