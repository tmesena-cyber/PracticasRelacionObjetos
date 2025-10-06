public class Perro {
    private String nombre;
    private String raza;
    private String color;

    //Constructores
    public Perro (String pNombre,
                  String pRaza,
                  String pColor){
        nombre = pNombre;
        raza = pRaza;
        color = pColor;
    }
    public Perro (){};

    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public String getColor() {
        return color;
    }

    //Setters
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Métodos
    public void jugar (String instruccion){
        System.out.println(nombre + " empieza a " + instruccion);
    }
}
