//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear IDE
        IDE IDE1 = new IDE("IntelliJ");

        //Crear programador
        Programador persona1 = new Programador("Alex");

        persona1.escribeCodigo(IDE1, "Hola Mundo");
    }
}