
import java.time.LocalDate;

public class Emprestimo {
    LocalDate datainicio;
    Ebook ebook;
    Utilizador utilizador;
    Integer NumeroDeProlongamentos;
    Boolean Assinado;
    String localizacao;
    Servidor servidor;


    public Emprestimo(LocalDate data) {
        this.datainicio = data;

    }

    public LocalDate getData() {
        return this.datainicio;
    }

    public void setData(LocalDate data) {
        this.datainicio = data;
    }


}
