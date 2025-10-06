import java.time.LocalDate;

public class CepilloDientes {
    private LocalDate fechaCompra;
    private boolean tieneBaterias;

    //Constructores
    public CepilloDientes (LocalDate pFechaCompra,
                           boolean pTieneBaterias){
        fechaCompra = pFechaCompra;
        tieneBaterias = pTieneBaterias;
    }

    //Getters
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    public boolean getTieneBaterias(){
        return tieneBaterias;
    }

    //Setters
    public void setFechaCompra(LocalDate pFechaCompra){
        fechaCompra = pFechaCompra;
    }
    public void setTieneBaterias(boolean pTieneBaterias){
        tieneBaterias = pTieneBaterias;
    }

    //ToString
    public String toString (){
        return "Nuevo Cepillo:\n" + "Fecha de compra: \n" + fechaCompra + "\n" + "¿Tiene baterías? \n" + tieneBaterias + "\n";
    }
}
