
import java.util.ArrayList;
import java.util.Iterator;

public class Repositorio {
    ArrayList<Utilizador> ListaUtilizadores = new ArrayList();



    ArrayList<Livro> ListaLivro = new ArrayList();
    ArrayList<Emprestimo> Lista_emprestimos = new ArrayList();


    public Repositorio() {
    }






    public void adicionaUtilizador(Utilizador utilizador) {
        this.ListaUtilizadores.add(utilizador);
    }







    public void adicionaLivro(Livro livro) {
        this.ListaLivro.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        this.Lista_emprestimos.add(emprestimo);
    }



}
