//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Persona yo = new Persona("Tirsa");

    Perro miMascota = new Perro("Firu","Chiguagua","Blanco");

    yo.agregarMascota(miMascota);
    yo.jugarConMascota("jugar");
    }
}