public class IDE {
    private String nombre;

    //Constructor
    public IDE(String pNombre){
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
    public void correrPrograma(String nuevoPrograma){
        System.out.println(nuevoPrograma);
    }
}
